private void updateAndStartTasks() {
    if ((timer) != null) {
        new com.android.gscaparrotti.bendermobile.fragments.TableFragment.ServerOrdersDownloader().execute();
    }else {
        timer = new java.util.Timer();
        timer.schedule(new java.util.TimerTask() {
            @java.lang.Override
            public void run() {
                new com.android.gscaparrotti.bendermobile.fragments.TableFragment.ServerOrdersDownloader().execute(tableNumber);
            }
        }, 0, 5000);
    }
}