private void loadPageFromBackStack() {
    if ((backStack.size()) == 0) {
        return ;
    }
    org.wikipedia.page.PageBackStackItem item = backStack.get(((backStack.size()) - 1));
    displayNewPage(item.getTitle(), item.getHistoryEntry(), true, false);
    stagedScrollY = item.getScrollY();
}