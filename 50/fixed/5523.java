@java.lang.Override
public void onDestroyActionMode(android.view.ActionMode mode) {
    ((net.micode.fileexplorer.FileExplorerTabActivity) (net.micode.fileexplorer.FileListItem.mContext)).setActionMode(null);
}