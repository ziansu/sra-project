@java.lang.Override
public void disposeUIResources() {
    com.intellij.util.ui.UIUtil.dispose(myCbShowImportPopup);
    com.intellij.util.ui.UIUtil.dispose(myCbAddUnambiguousImports);
    com.intellij.util.ui.UIUtil.dispose(myExcludePackagesList);
    myCbShowImportPopup = null;
    myCbAddUnambiguousImports = null;
    myExcludePackagesList = null;
    if ((myExcludePackagesModel) != null)
        myExcludePackagesModel.removeAllElements();
    
    myExcludePackagesModel = null;
}