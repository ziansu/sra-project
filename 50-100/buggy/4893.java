private void removeExpiredCampaings(int currentDay) {
    for (java.util.Map.Entry<java.lang.Integer, CampaignData> camp : myCampaigns.entrySet()) {
        CampaignData campData = camp.getValue();
        if ((campData.dayEnd) > currentDay)
            myCampaigns.remove(campData.id);
        
    }
}