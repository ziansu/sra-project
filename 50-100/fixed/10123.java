private void jumpToPage() {
    java.lang.Integer targetPage = pageField.getTextAsInteger();
    if (targetPage == null) {
        return ;
    }
    if ((targetPage != null) && (!((targetPage >= 1) && (targetPage <= (totalPages))))) {
        showErrorMessage("Invalid page");
        return ;
    }
    currentPage = targetPage - 1;
    displayPage(currentPage);
    updatePageNumberLabelAndNavigation();
}