public void mailNotifySelected() {
    try {
        this.oBorrowBean.mailOneLateUser(this.borrow);
        this.message.info(("Notification sent to: " + (this.borrow.getUser().getUserName())));
    } catch (java.lang.Exception e) {
        this.oLogger.error(e);
        this.exceptionHandler.showMessage(e);
    }
}