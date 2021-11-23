public static void main(java.lang.String[] args) {
    java.lang.System.out.println((((("ModLauncher running Build " + (com.eyeball.modlauncher.build.BuildInfo.VERSION)) + " started on ") + (com.eyeball.modlauncher.info.OSType.getOS())) + "."));
    com.eyeball.modlauncher.file.FileHelper.initFilesAsNeeded();
    com.eyeball.modlauncher.file.FileHelper.downloadFiles();
    com.eyeball.modlauncher.login.LoginHelper.loginIfNeeded();
    com.eyeball.modlauncher.modpack.LoadInfo loadInfo = com.eyeball.modlauncher.modpack.ModPackHelper.requestVersion();
}