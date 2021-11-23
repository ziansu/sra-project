private void tryUpdateApp(com.gema.photocontroller.commons.DownloadFiles downloadFiles) {
    if (downloadFiles.tryUpdate()) {
        com.gema.photocontroller.interfaces.Command update = new com.gema.photocontroller.commands.AppUpdateCommand();
        update.execute(getApplicationContext());
        finish();
    }
}