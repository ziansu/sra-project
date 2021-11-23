public void refresh() {
    org.openide.util.RequestProcessor rp = com.junichi11.netbeans.modules.github.issues.GitHubIssues.getInstance().getRequestProcessor();
    rp.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if (gitHubIssue.isNew()) {
                return ;
            }
            gitHubIssue.refreshIssue();
            javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    update();
                }
            });
        }
    });
}