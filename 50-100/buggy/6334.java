public void saveModel() {
    savePath = (this.sourcesPath.getPath()) + "\\prettyPrint";
    java.io.File savePathFile = new java.io.File(savePath);
    if (!(savePathFile.exists())) {
        if (!(savePathFile.mkdir())) {
            java.lang.System.out.println(">> !!! Error while creating the save directory. ");
            return ;
        }
    }
    App.launcher.setSourceOutputDirectory(savePath);
    App.launcher.prettyprint();
}