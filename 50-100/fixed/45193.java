public java.lang.String getCountry(java.lang.String locationFullText) {
    java.lang.String country = "";
    if ((!(locationFullText.contains(","))) || (locationFullText.matches("\\d"))) {
        return country;
    }
    try {
        java.lang.String[] addressData = locationFullText.split(",");
        country = addressData[((addressData.length) - 1)];
    } catch (java.lang.IndexOutOfBoundsException e) {
        e.printStackTrace();
    }
    return country;
}