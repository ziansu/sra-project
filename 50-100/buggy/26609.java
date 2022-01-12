public static java.lang.String supportFilePath() {
    java.lang.String supportFilePath = "";
    boolean isWindowsSystem = com.elle.ProjectManager.logic.FilePathFormat.isWindows();
    if (isWindowsSystem) {
        supportFilePath = ("C:\\Users\\" + (java.lang.System.getProperty("user.name"))) + "\\Documents\\ProjectManager\\";
    }else {
        supportFilePath = ("/Users/" + (java.lang.System.getProperty("user.name"))) + "/Library/Application Support/ProjectManager/";
    }
    java.io.File dir = new java.io.File(supportFilePath);
    dir.mkdir();
    return supportFilePath;
}