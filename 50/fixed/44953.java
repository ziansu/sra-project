@java.lang.Override
public void onClick(android.view.View view) {
    int nextPage = mCurrentPage.getChoice1().getNextPage();
    loadPage(nextPage);
}