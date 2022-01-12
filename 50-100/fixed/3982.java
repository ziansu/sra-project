public java.util.List<com.zoho.creator.jframework.ZCChoice> loadMoreChoices() throws com.zoho.creator.jframework.ZCException {
    if (!(isLastReachedForChoices)) {
        java.util.List<com.zoho.creator.jframework.ZCChoice> moreChoices = com.zoho.creator.jframework.ZOHOCreator.loadMoreChoices(this);
        choices.addAll(moreChoices);
        if ((moreChoices.size()) < 50) {
            isLastReachedForChoices = true;
        }
        return moreChoices;
    }
    return new java.util.ArrayList<com.zoho.creator.jframework.ZCChoice>();
}