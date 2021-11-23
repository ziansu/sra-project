@java.lang.Override
public void uploadStarted(com.vaadin.ui.Upload.StartedEvent startedEvent) {
    if (!("image/jpeg".equals(startedEvent.getMIMEType()))) {
        startedEvent.getUpload().interruptUpload();
        java.lang.String caption = "Oh, no! Only '.jpg' and '.jpeg' files can be uploaded.";
        com.vaadin.ui.Notification.show(caption, Notification.Type.WARNING_MESSAGE);
    }
}