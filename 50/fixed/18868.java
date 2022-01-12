private void setMacAddress(java.lang.String trimmedResponse) {
    timber.log.Timber.i("Retrieved mac address: %s", trimmedResponse);
    macAddress.set(trimmedResponse);
    if ((linkListener) != null) {
        linkListener.onMacAddressUpdated();
    }
}