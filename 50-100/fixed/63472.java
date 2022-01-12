private void loadListing() {
    clearListing();
    if ((filterListing()) != null) {
        listing.setListData(filterListing().toArray());
        if ((currentMessage) == null) {
            listing.ensureIndexIsVisible(0);
        }else {
            selectCurrentLine(currentMessage);
        }
        checkListContent();
    }
}