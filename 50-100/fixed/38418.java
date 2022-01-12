@java.lang.Override
public java.util.Map<java.lang.String, java.lang.String> getHeaders() throws com.android.volley.AuthFailureError {
    java.util.Map<java.lang.String, java.lang.String> headers = super.getHeaders();
    if ((this.token_) != null)
        headers.put("Authorization", ("Bearer " + (this.token_.getAccessToken())));
    
    return headers;
}