private void loadListing() {
    clearListing();
    java.util.ArrayList v = filterListing();
    if (v != null) {
        listing.setListData(v.toArray());
        if ((currentMessage) == null) {
            listing.ensureIndexIsVisible(0);
        }else {
            selectCurrentLine(currentMessage);
        }
        checkListContent();
    }
}