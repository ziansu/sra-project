private static void processSignature(org.json.JSONObject jsonCommand) throws org.json.JSONException {
    if (jsonCommand.has(GNSProtocol.SIGNATURE.toString())) {
        java.lang.String signature = jsonCommand.getString(GNSProtocol.SIGNATURE.toString());
        jsonCommand.remove(GNSProtocol.SIGNATURE.toString());
        java.lang.String commandSansSignature = edu.umass.cs.gnscommon.utils.CanonicalJSON.getCanonicalForm(jsonCommand);
        jsonCommand.put(GNSProtocol.SIGNATURE.toString(), signature).put(GNSProtocol.SIGNATUREFULLMESSAGE.toString(), commandSansSignature);
    }
}