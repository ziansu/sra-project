public static void main(java.lang.String[] args) {
    statistics.Project p = new statistics.Project("AndlyticsProject/andlytics", "/Users/paolaaccioly/Dropbox/workspace_emse/ResultData", "downloads2");
    p.analyzeMergeCommits();
    java.lang.System.out.println(p);
}