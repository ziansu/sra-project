@java.lang.Override
public void onBackPressed() {
    if (isSearchOpened) {
        handleMenuSearch();
        return ;
    }
    super.onBackPressed();
}