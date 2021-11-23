@java.lang.Override
protected org.ksoap2.serialization.SoapObject doInBackground(java.lang.Void... params) {
    org.ksoap2.serialization.SoapObject object = null;
    try {
        java.lang.String get_for = "app";
        com.narnolia.app.network.SOAPWebService webService = new com.narnolia.app.network.SOAPWebService(mContext);
        object = webService.GetLead(empcode, "", get_for);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return object;
}