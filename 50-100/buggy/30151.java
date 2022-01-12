public static void showResultFileTree(java.lang.StringBuffer sb, java.util.ArrayList<java.io.File> listOfDirs, java.lang.Object[] extensions, finder.model.FinderInstance finderInstance) {
    javafx.scene.control.TreeItem<java.lang.String> resultRootItem = new javafx.scene.control.TreeItem<java.lang.String>(((javafx.scene.control.CheckBoxTreeItem<java.lang.String>) (finderInstance.getFileTree().getRoot())).getValue());
    finder.util.ResultTreeCreateLogic.generateResultTree(resultRootItem, listOfDirs);
    finderInstance.getResultFileTree().setSearchText(sb.toString());
    finderInstance.getResultFileTree().setRoot(resultRootItem);
}