public static void first() {
    java.lang.String Path = (((xyz.jaoafa.mymaid.BugReport.plugin.getDataFolder()) + (java.io.File.separator)) + "bugreport") + (java.io.File.separator);
    java.io.File folder = new java.io.File(Path);
    if (folder.exists()) {
        return ;
    }
    if (folder.mkdir()) {
        org.bukkit.Bukkit.getLogger().info("BugReportのリポートディレクトリの作成に成功しました。");
        xyz.jaoafa.mymaid.BugReport.folder = Path;
    }else {
        org.bukkit.Bukkit.getLogger().info("BugReportのリポートディレクトリの作成に失敗しました。");
    }
}