public java.util.concurrent.Future<com.alexwyler.jurl.Jurl> goAsync() {
    return com.alexwyler.jurl.Jurl.backgroundExecutor.submit(new java.util.concurrent.Callable<com.alexwyler.jurl.Jurl>() {
        @java.lang.Override
        public com.alexwyler.jurl.Jurl call() throws java.lang.Exception {
            go();
            return null;
        }
    });
}