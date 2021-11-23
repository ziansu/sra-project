@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    setSpanDot(contentType, isVisible);
    if (!(spanDot.getStyleName().contains("tick"))) {
        org.ednovo.gooru.application.client.gin.AppClientFactory.fireEvent(new org.ednovo.gooru.client.mvp.gshelf.coursedetails.EnablePublishButtonEvent(true));
    }
}