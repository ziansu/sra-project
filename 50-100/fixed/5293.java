public static void first() {
    java.lang.String Path = (((xyz.jaoafa.mymaid.BugReport.plugin.getDataFolder()) + (java.io.File.separator)) + "bugreport") + (java.io.File.separator);
    java.io.File folder = new java.io.File(Path);
    if (folder.exists()) {
        xyz.jaoafa.mymaid.BugReport.folder = Path;
        return ;
    }
    if (folder.mkdir()) {
        xyz.jaoafa.mymaid.BugReport.plugin.getLogger().info("BugReportのリポートディレクトリの作成に成功しました。");
        xyz.jaoafa.mymaid.BugReport.folder = Path;
    }else {
        xyz.jaoafa.mymaid.BugReport.plugin.getLogger().info("BugReportのリポートディレクトリの作成に失敗しました。");
    }
}