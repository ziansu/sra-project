@java.lang.Override
public java.util.Map<java.lang.String, java.lang.String> getHeaders() throws com.android.volley.AuthFailureError {
    java.util.HashMap<java.lang.String, java.lang.String> headers = new java.util.HashMap<>();
    headers.put("User-agent", java.lang.System.getProperty("http.agent"));
    return headers;
}