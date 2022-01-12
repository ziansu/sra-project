@org.testng.annotations.BeforeMethod(groups = { "Acceptance" })
public void setUp() {
    viewSalesForceUpdate = com.salesforce.dev.framework.utils.JSONMapper.getGeneric(com.salesforce.dev.framework.dto.ViewSalesForce.class, "EditLeadsViewBasic.json");
    com.salesforce.dev.framework.dto.ViewSalesForce viewSalesForce = com.salesforce.dev.framework.utils.LeadGenie.getLeadsView("CreateLeadsViewBasic.json");
    viewName = viewSalesForce.getViewName();
    mainPage = com.salesforce.dev.pages.LoginPage.loginAsPrimaryUser();
    navigationBar = mainPage.gotoNavBar();
    leadsHome = navigationBar.gotToLeadsHome();
    leadView = leadsHome.clickNewViewLnk().setViewName(viewName).setUniqueViewName(viewSalesForce.getUniqueViewName());
    leadViewDetail = leadView.clickSaveBtn();
}