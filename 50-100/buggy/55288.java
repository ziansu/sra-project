@java.lang.Override
public void done(java.util.List<com.parse.ParseObject> results, com.parse.ParseException e) {
    com.parse.ParseObject installObj;
    if ((results.size()) <= 0) {
        installObj = new com.parse.ParseObject("AndroidInstallation");
        installObj.put("installationId", installationId);
    }else {
        installObj = results.get(0);
    }
    installObj.put("appVersion", getAppVersion());
    installObj.put("androidVersion", android.os.Build.VERSION.RELEASE);
    installObj.saveInBackground();
}