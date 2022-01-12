@java.lang.SuppressWarnings(value = "unchecked")
public void addClassLoaderReference(java.lang.ref.WeakReference<java.lang.ClassLoader> reference) {
    synchronized(this) {
        if (!(org.apache.commons.lang.ArrayUtils.contains(classLoaderReferences, reference))) {
            classLoaderReferences = ((java.lang.ref.WeakReference<java.lang.ClassLoader>[]) (org.apache.commons.lang.ArrayUtils.add(((java.lang.Object[]) (classLoaderReferences)), reference)));
        }
    }
}