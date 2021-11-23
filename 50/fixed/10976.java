public void onEvent(com.pindroid.event.AccountChangedEvent event) {
    if (!(event.getNewAccount().equals(username))) {
        this.username = event.getNewAccount();
        refresh();
    }
}