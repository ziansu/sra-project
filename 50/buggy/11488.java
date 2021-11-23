@java.lang.Override
public void onSearchViewClosed() {
    fragmentWorkRecycler.showListView();
    fragmentWorkRecycler.cloneItems();
}