private void loadReportList() {
    if ((reportDirectory.length()) == 0)
        return ;
    
    java.io.File folder = new java.io.File(reportDirectory);
    java.io.File[] listOfFiles = folder.listFiles();
    for (int i = 0; i < (listOfFiles.length); i++) {
        if (listOfFiles[i].isFile()) {
            reports.add(listOfFiles[i].getName());
        }
    }
}