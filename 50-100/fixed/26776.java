private static boolean cancelPotentialWork(java.lang.String url, android.widget.ImageView view) {
    final edu.chs.achievement.controller.BitmapWorkerTask bitmapWorkerTask = edu.chs.achievement.controller.BitmapWorkerTask.getBitmapWorkerTask(view);
    if (bitmapWorkerTask != null) {
        final java.lang.String bitmapUrl = bitmapWorkerTask.url;
        if (("".equals(bitmapUrl)) || (bitmapUrl == url)) {
            bitmapWorkerTask.cancel(true);
        }else {
            return false;
        }
    }
    return true;
}