public void sendSMSMessages() {
    if (contacts.isEmpty()) {
        android.support.design.widget.Snackbar.make(findViewById(R.id.container), getString(R.string.contactListEmpty), Snackbar.LENGTH_LONG).setAction(R.string.Action, null).show();
        return ;
    }
    if (!(gps.canGetLocation())) {
        sendMessages(false);
    }else {
        sendMessages(true);
    }
}