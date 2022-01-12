public void testGetExpirationDate() {
    java.lang.System.out.println("Testing PinNumber::getExpirationDate");
    edu.jalc.inclass.cocacola.security.PinNumber pinNumber = new edu.jalc.inclass.cocacola.security.PinNumber(0);
    java.util.Calendar expiresOn;
    expiresOn = java.util.Calendar.getInstance();
    expiresOn.add(java.util.Calendar.DATE, 365);
    java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("yyyy/MM/dd");
    assert pinNumber.getExpirationDate().equals(dateFormat.format(expiresOn.getTime()));
}