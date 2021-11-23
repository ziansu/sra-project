private void postFinished(final boolean success) {
    org.floens.chan.utils.AndroidUtils.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            callback.imageSaveTaskFinished(org.floens.chan.core.saver.ImageSaveTask.this, success);
        }
    });
}