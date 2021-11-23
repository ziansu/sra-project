private boolean handleMockLocation() {
    if ((((Build.VERSION.SDK_INT) <= 23) && (!("0".equals(Settings.Secure.getString(getContentResolver(), Settings.Secure.ALLOW_MOCK_LOCATION))))) || ((((Build.VERSION.SDK_INT) > 23) && ((currentLocation) != null)) && (currentLocation.isFromMockProvider()))) {
        mockLocationDetected();
        return true;
    }
    return false;
}