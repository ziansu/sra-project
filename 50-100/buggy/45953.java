@java.lang.Override
public java.util.Map<java.lang.String, java.lang.String> getHeaders() throws com.android.volley.AuthFailureError {
    java.util.Map<java.lang.String, java.lang.String> params = new java.util.HashMap<>();
    params.put("Authorization", AuthToken);
    params.put("Username", UserName);
    params.put("Content-Type", "application/json");
    params.put("Accept", "application/json");
    return params;
}