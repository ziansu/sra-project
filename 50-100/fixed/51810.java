@java.lang.Override
public void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
    final int lastItem = firstVisibleItem + visibleItemCount;
    if ((getActivity()) != null) {
        if ((lastItem == totalItemCount) && (totalItemCount > visibleItemCount)) {
            ((com.krepchenko.yourshoppinglist.ui.activity.MainActivity) (getActivity())).hideFam();
        }else {
            ((com.krepchenko.yourshoppinglist.ui.activity.MainActivity) (getActivity())).showFam();
        }
    }
}