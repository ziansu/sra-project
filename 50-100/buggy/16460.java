@java.lang.Override
protected void onPostCreate(android.os.Bundle bundle) {
    super.onPostCreate(bundle);
    showInfoDialog();
    checkUpdates();
    checkIfServerOutdated();
    github.popeen.dsub.view.ChangeLog changeLog = new github.popeen.dsub.view.ChangeLog(this, github.popeen.dsub.util.Util.getPreferences(this));
    if (changeLog.isFirstRun()) {
        if (changeLog.isFirstRunEver()) {
            changeLog.updateVersionInPreferences();
        }else {
            android.app.Dialog log = changeLog.getLogDialog();
            if (log != null) {
                log.show();
            }
        }
    }
}