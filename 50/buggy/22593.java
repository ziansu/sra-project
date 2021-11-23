private synchronized void setNumber(java.lang.String number) {
    if (number != null) {
        number = number.replaceAll("[^\\d+]", "");
    }
    mNumber = number;
}