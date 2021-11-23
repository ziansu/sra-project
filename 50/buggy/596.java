public synchronized void countMessage(int bytesNum) {
    totalBytes += bytesNum / (1024 * 1024);
    java.lang.System.out.println((("current bytes " + (totalBytes)) + " MB"));
}