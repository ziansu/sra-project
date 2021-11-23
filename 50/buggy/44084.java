@java.lang.Override
public void onPause() {
    this.logger().log(java.util.logging.Level.INFO, "De-Registering from contact data manager");
    this.contactsDataManager.deleteObserver(this);
}