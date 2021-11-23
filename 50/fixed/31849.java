public static io.reark.reark.pojo.NetworkRequestStatus error(java.lang.String uri, int errorCode, java.lang.String errorMessage) {
    return new io.reark.reark.pojo.NetworkRequestStatus(uri, io.reark.reark.pojo.NetworkRequestStatus.Status.NETWORK_STATUS_ERROR, errorCode, errorMessage);
}