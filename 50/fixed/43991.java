public void updateFromRemoteComplete() {
    java.lang.System.out.println("Updating from complete. Fulfilling silently.");
    if (!(requests.isEmpty())) {
        requests.remove().fulfillSilently(this);
    }
}