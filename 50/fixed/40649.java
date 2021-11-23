@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.String[] paths = com.github.angads25.filepicker.model.MarkedItemList.getSelectedPaths();
    if ((callbacks) != null) {
        callbacks.onSelectedFilePaths(paths);
    }
    dismiss();
}