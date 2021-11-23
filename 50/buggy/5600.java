public void goOffline() {
    try {
        status.goOffline();
    } catch (rUBERn.Exceptions.AlreadyInStatusException | rUBERn.Exceptions.InvalidStatusChangeException e) {
        e.printStackTrace();
    }
}