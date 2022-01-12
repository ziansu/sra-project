@java.lang.Override
public boolean onLongClick(android.view.View view) {
    if (!(mMultiSelector.isSelectable())) {
        mMultiSelector.setSelectable(true);
        mMultiSelector.setSelected(this, true);
        folderInterface.changeFabAction("delete", ((com.example.abhilashmirji.virtualfileexplorer.FolderObject) (view.getTag())));
        return true;
    }else {
        folderInterface.changeFabAction("add", ((com.example.abhilashmirji.virtualfileexplorer.FolderObject) (view.getTag())));
    }
    return false;
}