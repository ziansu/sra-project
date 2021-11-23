public static void showResultFileTree(java.lang.StringBuffer sb, java.util.List<java.io.File> listOfDirs, finder.model.FinderInstance finderInstance) {
    javafx.scene.control.TreeItem<java.lang.String> resultRootItem = new javafx.scene.control.TreeItem(finderInstance.getFileTree().getRoot().getValue());
    finder.util.ResultTreeCreateLogic.generateResultTree(resultRootItem, listOfDirs);
    finderInstance.getResultFileTree().setSearchText(sb.toString());
    finderInstance.getResultFileTree().setRoot(resultRootItem);
}