@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    if (!(spanDot.getStyleName().contains("tick"))) {
        setSpanDot(contentType, isVisible);
        org.ednovo.gooru.application.client.gin.AppClientFactory.fireEvent(new org.ednovo.gooru.client.mvp.gshelf.coursedetails.EnablePublishButtonEvent(true));
    }
}