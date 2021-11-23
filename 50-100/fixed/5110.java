public java.lang.String getAddressToString() {
    try {
        java.lang.String address = "";
        int maxLines = getAddress().getMaxAddressLineIndex();
        for (int i = 0; i <= maxLines; i++) {
            address = (address + (getAddress().getAddressLine(i))) + " ";
        }
        return address;
    } catch (java.lang.NullPointerException e) {
    }
    return null;
}