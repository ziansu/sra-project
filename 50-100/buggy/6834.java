@java.lang.Override
protected java.lang.Object doInBackground(java.lang.Object[] objects) {
    java.lang.String methodName = "insertPersonDetails";
    webService = new com.idbi.app.network.SOAPWebservice(mContext);
    com.idbi.app.model.Output object = null;
    getNomineeData();
    for (int i = 0; i < (nomineeDetailsList.size()); i++) {
        object = webService.insertUpdatePersonalDetails(nomineeDetailsList.get(i), methodName);
    }
    return object;
}