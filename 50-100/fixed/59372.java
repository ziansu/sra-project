@org.testng.annotations.Test(groups = { "Acceptance" })
public void testCreateCampaignView() {
    com.salesforce.dev.pages.campaigns.CampaignsHome campaignsHome = navigationBar.goToCampaignsHome();
    com.salesforce.dev.pages.campaigns.CampaignView campaignView = campaignsHome.clickNewViewLnk().setViewName(viewSalesForce.getViewName()).setUniqueViewName(viewSalesForce.getUniqueViewName()).checkFilterByOwner(viewSalesForce.getFilterByOwner()).selectRestrictVisibility(viewSalesForce.getRestrictVisibility());
    campaignViewDetail = campaignView.clickSaveBtn();
    org.testng.Assert.assertTrue(campaignViewDetail.validateNameView(viewSalesForce.getViewName()));
}