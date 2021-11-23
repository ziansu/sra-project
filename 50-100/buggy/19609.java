public void mailNotifySelected() {
    try {
        oBorrowBean.mailOneLateUser(borrow);
        message.info(("Notification sent to: " + (borrow.getUser().getUserName())));
    } catch (java.lang.Exception e) {
        oLogger.error(e);
        exceptionHandler.showMessage(e);
    }
}