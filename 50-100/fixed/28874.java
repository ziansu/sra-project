@java.lang.Override
public void onItemMove(int from, int to) {
    java.util.Collections.swap(mDataset, from, to);
    if ((com.ha81dn.webausleser.MainActivity.appActionMode) != null) {
        toggleSelection(from, true);
        toggleSelection(to, true);
    }
    notifyItemMoved(from, to);
}