private void updateStartRunUI() {
    uiUpdateHandler.sendEmptyMessage(com.donbosco.android.porlosjovenes.activities.RunActivity.MESSAGE_UPDATE_UI);
    if (!(crRunTime.isRunning())) {
        long chronoBase = (android.os.SystemClock.elapsedRealtime()) - ((locationService.elapsedTime()) * 1000);
        crRunTime.setBase(chronoBase);
        crRunTime.start();
    }
}