public com.virtualightning.stateframework.http.Request.Builder addFormData(com.virtualightning.stateframework.http.Request.FormData formData) {
    if (formData.isEmpty)
        return this;
    
    if (formData instanceof com.virtualightning.stateframework.http.MultiFile)
        requestBody.isMultipart = true;
    
    formData.requestBody = requestBody;
    requestBody.formData.put(formData.key, formData);
    java.net.HttpURLConnection urlConnection;
    return this;
}