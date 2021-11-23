void mPublishProgress(int progressToPublish) {
    try {
        java.lang.Thread.sleep(200);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    publishProgress(progressToPublish);
}