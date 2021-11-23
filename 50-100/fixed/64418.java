@java.lang.Override
public void onDataSaved(@android.support.annotation.Nullable
com.idonans.doodle.DoodleData doodleData) {
    com.idonans.doodle.demo.MainActivity.DoodleDataAsyncTask.save("play", doodleData, false, new com.idonans.doodle.demo.MainActivity.DoodleDataAsyncTask.DoodleDataSaveCallback() {
        @java.lang.Override
        public void onSaveSuccess(final java.lang.String path) {
            com.idonans.acommon.lang.Threads.runOnUi(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    if (com.idonans.doodle.demo.MainActivity.this.isAvailable()) {
                        android.content.Intent intent = com.idonans.doodle.demo.DoodlePlayActivity.start(com.idonans.doodle.demo.MainActivity.this, path, false);
                        com.idonans.doodle.demo.MainActivity.this.startActivity(intent);
                    }
                }
            });
        }
    });
}