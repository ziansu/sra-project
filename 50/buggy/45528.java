public static edu.umass.cs.gigapaxos.interfaces.Request staticGetRequest(java.lang.String stringified) throws edu.umass.cs.reconfiguration.reconfigurationutils.RequestParseException, org.json.JSONException {
    edu.umass.cs.reconfiguration.examples.AppRequest request = null;
    if (stringified.equals(Request.NO_OP)) {
        return edu.umass.cs.reconfiguration.examples.noopsimple.NoopApp.getNoopRequest();
    }
    return new edu.umass.cs.reconfiguration.examples.AppRequest(new org.json.JSONObject(stringified));
}