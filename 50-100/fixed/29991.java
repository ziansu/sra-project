public static void onActivityCreate(android.app.Activity activity) {
    if ((com.busylee.issuehandler.IssueHandler.isApplicationDebugable(activity)) || (com.busylee.issuehandler.IssueHandler.INSTANCE.mIgnoreDebugMode)) {
        com.busylee.issuehandler.IssueHandler.INSTANCE.setActivity(activity);
        if ((java.lang.Thread.getDefaultUncaughtExceptionHandler()) instanceof com.busylee.issuehandler.IssueHandler)
            return ;
        
        java.lang.Thread.setDefaultUncaughtExceptionHandler(com.busylee.issuehandler.IssueHandler.INSTANCE);
        if (!(com.busylee.issuehandler.IssueHandler.isIssueBotInstalled(activity))) {
            com.busylee.issuehandler.IssueHandler.showIssueBotInstallDialog(activity);
            return ;
        }
    }
}