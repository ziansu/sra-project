@java.lang.Override
public void setClassView(org.ednovo.gooru.application.shared.model.content.ClasspageDo classpageDo) {
    org.ednovo.gooru.application.client.gin.AppClientFactory.printInfoLogger("Edit Class Set Class View");
    this.classpageDo = classpageDo;
    classCodeTxtPanel.setText(classpageDo.getClassCode());
    activeListPageNum = 0;
    activeListTotalCount = 0;
    pendingListPageNum = 0;
    pendingListTotalCount = 0;
    pendingOffsetValue = 0;
    java.lang.String subPageView = org.ednovo.gooru.application.client.gin.AppClientFactory.getPlaceManager().getRequestParameter(UrlNavigationTokens.TEACHER_CLASS_SUBPAGE_VIEW, "");
    org.ednovo.gooru.application.client.gin.AppClientFactory.printInfoLogger(("subPageView:" + subPageView));
}