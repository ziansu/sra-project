public void updateFromRemoteComplete() {
    java.lang.System.out.println("Updating from complete. Fulfilling silently.");
    requests.remove().fulfillSilently(this);
}