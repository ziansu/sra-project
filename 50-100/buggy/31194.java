@java.lang.Override
protected O doInBackground(java.lang.Void... params) {
    try {
        java.lang.String res;
        if ((requestObject) == null) {
            res = executeGet(url);
        }else {
            res = executePost(url, requestObject);
        }
        if (res != null) {
            responseObject.decode(res);
            return responseObject;
        }
    } catch (java.lang.Exception e) {
        ch.uzh.csg.coinblesk.client.request.RequestTask.LOGGER.error("Request failed: {}", e);
        responseObject.setSuccessful(false);
        responseObject.setMessage(e.getMessage());
    }
    return responseObject;
}