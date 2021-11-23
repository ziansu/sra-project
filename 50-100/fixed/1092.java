@java.lang.Override
protected java.lang.Void doInBackground(java.lang.String... v) {
    org.stackdroid.comm.OSClient osc = org.stackdroid.comm.OSClient.getInstance(U);
    try {
        osc.createRouter(v[0]);
    } catch (org.stackdroid.comm.ServerException se) {
        errorMessage = org.stackdroid.parse.ParseUtils.parseNeutronError(se.getMessage());
        hasError = true;
    } catch (java.lang.Exception e) {
        errorMessage = e.getMessage();
        hasError = true;
    }
    return null;
}