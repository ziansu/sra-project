protected void checkError(com.google.gson.JsonObject resultMessage) throws org.rapla.framework.RaplaException {
    com.google.gson.JsonElement errorElement = resultMessage.get("error");
    if (errorElement != null) {
        org.rapla.framework.RaplaException ex = deserializeExceptionObject(resultMessage);
        java.lang.String message = ex.getMessage();
        if (loginCmd || (message == null)) {
            throw ex;
        }
        if (((message.indexOf(RemoteStorage.USER_WAS_NOT_AUTHENTIFIED)) >= 0) && ((reconnectInfo) != null)) {
            throw new AuthenticationException(message);
        }
        throw ex;
    }
}