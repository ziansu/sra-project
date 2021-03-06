public void bytesWritten(int bytes) {
    long totalBytes = bytesWrittenSinceCheck.addAndGet(bytes);
    while (totalBytes > ((indexingBuffer.bytes()) / 30)) {
        if (runLock.tryLock()) {
            try {
                bytesWrittenSinceCheck.addAndGet((-totalBytes));
                runUnlocked();
            } finally {
                runLock.unlock();
            }
            totalBytes = bytesWrittenSinceCheck.addAndGet(bytes);
        }else {
            break;
        }
    } 
}