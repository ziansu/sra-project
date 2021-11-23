@java.lang.Override
public void setCurrentTypeView(java.lang.String currentTypeView) {
    this.currentTypeView = currentTypeView;
    enableAndHideTabs(true);
    enableOrHidePreviewBtn();
    enableOrHideShareTab();
    enableTabs();
}