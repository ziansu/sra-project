@java.lang.Override
public void onResponseReceived(com.google.gwt.http.client.Request request, com.google.gwt.http.client.Response response) {
    int statusCode = response.getStatusCode();
    if (statusCode == (com.google.gwt.http.client.Response.SC_OK)) {
        c.invoke(response.getText());
    }else {
        onError(null, new java.lang.IllegalArgumentException(((("Unable to retrieve map data for " + url) + ". Reason: ") + (response.getStatusText()))));
    }
}