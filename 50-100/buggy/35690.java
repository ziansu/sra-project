void init_servicePage_request() {
    mProfileId = editCampaign.mCampaignIdFromServer;
    mServicePageObj = com.fourway.ideaswire.ui.MainActivity.getProfileObject().getPageByName(mPageName);
    if ((mServicePageObj) == null) {
        lastPositionInList = com.fourway.ideaswire.ui.MainActivity.getProfileObject().getIndexOfPageFromName(mPageName);
        com.fourway.ideaswire.ui.MainActivity.getProfileObject().deletePageByName(mPageName);
    }
    mServicePageObj = new com.fourway.ideaswire.data.Page(mProfileId, mPageName);
    mParentId = mServicePageObj.getPageId();
}