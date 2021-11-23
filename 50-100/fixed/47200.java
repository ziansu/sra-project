public void goToLinkedPage() {
    org.wikipedia.history.HistoryEntry historyEntry = new org.wikipedia.history.HistoryEntry(pageTitle, org.wikipedia.history.HistoryEntry.SOURCE_INTERNAL_LINK);
    navigateSuccess = true;
    funnel.logNavigate();
    if ((getDialog()) != null) {
        getDialog().dismiss();
    }
    ((org.wikipedia.page.PageActivity) (getActivity())).displayNewPage(pageTitle, historyEntry);
}