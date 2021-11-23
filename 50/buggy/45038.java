@javax.annotation.CheckForNull
public java.lang.String getCallbackUrl() {
    return (getData()) != null ? getData().optString("callback_url") : null;
}