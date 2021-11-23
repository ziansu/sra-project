@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    im.vector.util.BugReporter.sendBugReportWithMail(currentActivity, true);
}