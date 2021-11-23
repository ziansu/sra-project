@java.lang.Override
public void execute(org.exoplatform.webui.event.Event<org.exoplatform.social.webui.activity.BaseUIActivity> event) throws java.lang.Exception {
    org.exoplatform.webui.application.WebuiRequestContext requestContext = event.getRequestContext();
    java.lang.String[] likeStatus = requestContext.getRequestParameter(org.exoplatform.social.webui.activity.OBJECTID).split("_");
    org.exoplatform.social.webui.activity.BaseUIActivity uiActivity = event.getSource();
    uiActivity.setLikeComment(java.lang.Boolean.parseBoolean(likeStatus[0]), likeStatus[1]);
    requestContext.addUIComponentToUpdateByAjax(uiActivity);
    org.exoplatform.social.webui.Utils.initUserProfilePopup(uiActivity.getId());
    org.exoplatform.social.webui.Utils.resizeHomePage();
}