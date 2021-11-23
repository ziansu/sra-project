@java.lang.Override
public void onMultiPageStateChanged(boolean isMultiPage) {
    if ((paginationView) != null) {
        paginationView.setVisibility((isMultiPage ? android.view.View.VISIBLE : android.view.View.GONE));
    }
}