void buildFromRootFile() throws java.io.IOException, javax.script.ScriptException {
    findPathAndTryAddToQueue(Router.RootPath);
    while (!(isQueueEmpty())) {
        java.lang.String path = getPathFromQueue();
        com.taozeyu.calico.generator.FileGenerator generator = router.getFileGenerator(path);
        java.util.List<java.lang.String> linkList = generator.generateAndGetPageLinkList(targetDir);
        java.lang.System.out.println();
        for (java.lang.String linkPath : linkList) {
            java.lang.System.out.println(linkPath);
            handleLinkPath(path, linkPath);
        }
    } 
}