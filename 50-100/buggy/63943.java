@java.lang.Override
public void onCampaignReady(com.appvirality.android.CampaignDetails campaignDetails) {
    if (((com.appvirality.CampaignHandler.progressDialog) != null) && (com.appvirality.CampaignHandler.progressDialog.isShowing()))
        com.appvirality.CampaignHandler.progressDialog.dismiss();
    
    if (campaignDetails != null) {
        com.appvirality.CampaignHandler.showGrowthHack(activity, growthType, campaignDetails);
    }else {
        com.appvirality.CampaignHandler.showCampaignsNotAvailable(activity);
    }
}