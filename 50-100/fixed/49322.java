protected void assertResponse(int status) {
    org.tiogasolutions.dev.common.net.HttpStatusCode statusCode = org.tiogasolutions.dev.common.net.HttpStatusCode.findByCode(status);
    if ((statusCode.isSuccess()) == false) {
        java.lang.String msg = java.lang.String.format("Unexpected response: %s %s", status, statusCode.getReason());
        throw org.tiogasolutions.dev.common.exceptions.ApiException.fromCode(statusCode, msg);
    }
}