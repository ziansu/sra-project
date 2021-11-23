public final void displayNotification(final nl.tudelft.lifetiles.notification.model.Notification notification) {
    label.setText(notification.getMessage());
    java.lang.String color = nl.tudelft.lifetiles.notification.controller.NotificationController.toRGBCode(notification.getColor());
    wrapper.setStyle(("-fx-background-color: " + color));
    final int displayTime = 3;
    hideAfter(displayTime);
}