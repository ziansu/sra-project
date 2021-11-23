public void getFile(final java.lang.String path, final com.amazonaws.mobile.content.ContentProgressListener callback) {
    com.quebec.app.Monitor.getInstance().s3Call("Getting file ");
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            try {
                userFileManagerCreatingLatch.await();
            } catch (final java.lang.InterruptedException ex) {
                throw new java.lang.RuntimeException(ex);
            }
            userFileManager.getContent(path.replaceFirst(com.quebec.app.S3Handler.S3_PREFIX_PROTECTED, ""), callback);
        }
    }).start();
}