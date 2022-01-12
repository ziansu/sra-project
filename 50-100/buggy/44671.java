public static void wait(final android.app.Activity context, final int time, final com.rubengees.vocables.utils.Utils.OnWaitFinishedListener listener) {
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            try {
                java.lang.Thread.sleep(time);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
            if (context != null) {
                context.runOnUiThread(new com.rubengees.vocables.utils.Utils.MyRunnable(listener));
            }
        }
    }).start();
}