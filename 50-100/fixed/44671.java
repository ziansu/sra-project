public static void wait(@android.support.annotation.NonNull
final android.app.Activity context, @android.support.annotation.NonNull
final int time, @android.support.annotation.NonNull
final com.rubengees.vocables.utils.Utils.OnWaitFinishedListener listener) {
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            try {
                java.lang.Thread.sleep(time);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
            context.runOnUiThread(new com.rubengees.vocables.utils.Utils.MyRunnable(listener));
        }
    }).start();
}