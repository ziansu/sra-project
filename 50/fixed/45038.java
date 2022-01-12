@javax.annotation.CheckForNull
public java.lang.String getCallbackUrl() {
    return (data) != null ? data.optString("callback_url") : null;
}