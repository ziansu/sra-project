private void monitorDownload() {
    final java.util.TimerTask timerTask = new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            float rate = serviceInterFace.getOfflineRate(user.getUserid(), user.getBookid());
            android.os.Message message = new android.os.Message();
            message.what = DOWNLOAD_UPDATE;
            message.obj = rate * 100;
            handler.sendMessage(message);
        }
    };
    timer = new java.util.Timer();
    timer.schedule(timerTask, 0, 1000);
}