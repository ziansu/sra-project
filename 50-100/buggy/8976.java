public void addCampaign(java.lang.String campId) throws java.lang.Exception {
    deleteCampaign(campId);
    com.xrtb.common.Campaign camp = com.xrtb.bidder.WebCampaign.getInstance().db.getCampaign(campId);
    if (camp == null) {
        throw new java.lang.Exception((("Campaign " + campId) + " does not exist in database"));
    }
    addCampaign(camp);
}