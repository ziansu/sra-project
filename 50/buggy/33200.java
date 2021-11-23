public void setSize(int width, int height, boolean setAsDefaultIfSuccess) {
    edit(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            setSizeUnsafe(width, height, setAsDefaultIfSuccess);
        }
    });
}