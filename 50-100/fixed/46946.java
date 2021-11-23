private java.lang.String requestHttp(com.amazon.speech.slu.Intent intent) throws java.io.IOException {
    java.util.List<org.apache.http.NameValuePair> params = new java.util.ArrayList<org.apache.http.NameValuePair>();
    params.add(new org.apache.http.message.BasicNameValuePair("temp", intent.getSlot(com.tss.carkak.temperature.TemperatureSpeechlet.SLOT_TEMPERATURE).getValue()));
    httpPostTemp(params);
    return getCurrentTemp();
}