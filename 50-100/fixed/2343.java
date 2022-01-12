@java.lang.Override
protected org.ksoap2.serialization.SoapObject doInBackground(java.lang.Void... params) {
    org.ksoap2.serialization.SoapObject object = null;
    try {
        com.narnolia.app.network.SOAPWebService webService = new com.narnolia.app.network.SOAPWebService(mContext);
        object = webService.GetLead(empcode);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return object;
}