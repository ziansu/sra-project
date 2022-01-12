@java.lang.Override
protected void setUp() throws java.lang.Exception {
    super.setUp();
    mainActivity = new dk.glutter.izbrannick.nativesmsforwarder.MainActivity();
    CurrentCountryCode = GetCountryZipCode();
    smsHandler = new dk.glutter.izbrannick.nativesmsforwarder.SmsHandler(getContext(), recieverNumber, recievedMessage, "0", false, true, true, true, false);
    android.telephony.TelephonyManager manager = ((android.telephony.TelephonyManager) (getSystemContext().getSystemService(Context.TELEPHONY_SERVICE)));
    CountryID = manager.getSimCountryIso().toUpperCase();
    testForwarder_countryCode();
}