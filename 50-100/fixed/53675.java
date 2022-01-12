@java.lang.SuppressWarnings(value = "unchecked")
public static void checkForGCByteArrays() {
    if (eta.runtime.io.IO.byteArrayFreeLock.compareAndSet(false, true)) {
        try {
            java.lang.ref.PhantomReference<eta.runtime.io.ByteArray> ref;
            while ((ref = ((java.lang.ref.PhantomReference<eta.runtime.io.ByteArray>) (eta.runtime.io.IO.byteArrayRefQueue.poll()))) != null) {
                java.lang.Long address = eta.runtime.io.IO.byteArrayRefMap.get(ref);
                if (address != null) {
                    eta.runtime.io.MemoryManager.free(address);
                }
                eta.runtime.io.IO.byteArrayRefMap.remove(ref);
            } 
        } finally {
            eta.runtime.io.IO.byteArrayFreeLock.set(false);
        }
    }
}