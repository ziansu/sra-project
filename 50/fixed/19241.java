private com.openshift.express.internal.client.response.OpenShiftResponse<java.lang.Object> createNakedResponse(java.lang.String response) throws com.openshift.express.client.OpenShiftException {
    if (response == null) {
        return null;
    }
    return new com.openshift.express.internal.client.response.unmarshalling.NakedResponseUnmarshaller().unmarshall(response);
}