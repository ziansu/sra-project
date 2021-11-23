@java.lang.Override
public void onClick(android.view.View v) {
    if (!(mMultiSelector.isSelectable())) {
        folderInterface.openFolder(((com.example.abhilashmirji.virtualfileexplorer.FolderObject) (v.getTag())));
    }
}