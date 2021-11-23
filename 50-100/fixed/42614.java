@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public edu.umass.cs.gnsserver.gnsapp.clientCommandProcessor.commandSupport.CommandResponse execute(org.json.JSONObject json, edu.umass.cs.gnsserver.gnsapp.clientCommandProcessor.ClientRequestHandlerInterface handler) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.spec.InvalidKeySpecException, org.json.JSONException {
    if (handler.getAdmintercessor().sendClearCache(handler)) {
        return new edu.umass.cs.gnsserver.gnsapp.clientCommandProcessor.commandSupport.CommandResponse(edu.umass.cs.gnscommon.GNSResponseCode.NO_ERROR, OK_RESPONSE);
    }else {
        return new edu.umass.cs.gnsserver.gnsapp.clientCommandProcessor.commandSupport.CommandResponse(edu.umass.cs.gnscommon.GNSResponseCode.NO_ERROR, OK_RESPONSE);
    }
}