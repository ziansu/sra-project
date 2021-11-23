@java.lang.Override
public void onItemMove(int from, int to) {
    java.util.Collections.swap(mDataset, from, to);
    if ((com.ha81dn.webausleser.MainActivity.appActionMode) != null) {
        toggleSelection(from);
        toggleSelection(to);
    }
    notifyItemMoved(from, to);
}