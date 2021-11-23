public void stop() {
    org.md2k.utilities.Report.Log.d(org.md2k.study.model_view.app_service.AppService.TAG, (("app_service...package_name=" + (package_name)) + " stop()"));
    if (!(isInstalled()))
        return ;
    
    if (!(isRunning()))
        return ;
    
    android.content.Intent intent = new android.content.Intent();
    intent.setClassName(package_name, service);
    context.stopService(intent);
}