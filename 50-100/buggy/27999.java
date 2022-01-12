private boolean handleMockLocation() {
    if ((((Build.VERSION.SDK_INT) <= 23) && (!(Settings.Secure.getString(getContentResolver(), Settings.Secure.ALLOW_MOCK_LOCATION).equals("0")))) || (((Build.VERSION.SDK_INT) > 23) && (currentLocation.isFromMockProvider()))) {
        mockLocationDetected();
        return true;
    }
    return false;
}