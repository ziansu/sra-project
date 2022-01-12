@java.lang.Override
public boolean onLongClick(android.view.View view) {
    if (!(mMultiSelector.isSelectable())) {
        mMultiSelector.setSelectable(true);
        mMultiSelector.setSelected(this, true);
        folderInterface.changeFabAction("delete", ((com.example.abhilashmirji.virtualfileexplorer.FolderObject) (view.getTag())));
        return true;
    }
    return false;
}