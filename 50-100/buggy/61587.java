protected java.util.List<shinigami.no.sekai.filenavigator.NavigationItem> initializeFileListData(java.io.File dir) {
    java.io.File[] filesInDir = dir.listFiles(mFileFilter);
    java.util.List<shinigami.no.sekai.filenavigator.NavigationItem> adapterFiles = new java.util.ArrayList<shinigami.no.sekai.filenavigator.NavigationItem>(filesInDir.length);
    for (java.io.File f : filesInDir) {
        adapterFiles.add(shinigami.no.sekai.filenavigator.FileNavigator.createNavigationItem(f));
    }
    return adapterFiles;
}