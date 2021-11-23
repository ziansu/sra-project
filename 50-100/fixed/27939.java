@cucumber.api.java.en.When(value = "^I select the Project option$")
public void iSelectTheProjectOption() {
    org.fundacionjala.dashboard.ui.pages.content.WidgetPage widgetPage = new org.fundacionjala.dashboard.ui.pages.content.WidgetPage();
    org.fundacionjala.dashboard.ui.pages.menu.StoryServiceForm storyServiceForm = widgetPage.clickTableWidgetType();
    org.fundacionjala.dashboard.ui.pages.content.ConfigTableProject configTableForm = storyServiceForm.clickOpenProject();
    org.fundacionjala.dashboard.ui.pages.content.ProjectTableWidget projectTableWidget = configTableForm.clickSaveConfigurationProject();
    tableProjectValues = projectTableWidget.getProjectTable();
}