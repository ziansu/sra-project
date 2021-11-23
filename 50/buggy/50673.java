public com.t_oster.visicam.Response servePlaintextError(java.lang.String errorText) {
    return new com.t_oster.visicam.Response(HTTP_INTERNALERROR, MIME_PLAINTEXT, errorText);
}