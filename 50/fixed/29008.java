public void smsRestore(android.view.View view) {
    try {
        com.mobilesafe.utils.SmsUtils.restoreSms(this, false);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (org.xmlpull.v1.XmlPullParserException e) {
        e.printStackTrace();
    }
}