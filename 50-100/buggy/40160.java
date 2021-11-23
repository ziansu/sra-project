private void onSMSArrive(org.json.JSONObject json) {
    java.lang.String from = json.optString(com.cordova.plugins.sms.SMSPlugin.ADDRESS);
    java.lang.String content = json.optString(com.cordova.plugins.sms.SMSPlugin.BODY);
    if ((from.equals(this.lastFrom)) && (content.equals(this.lastContent))) {
        return ;
    }
    if ((this.matchSMSFilter(json)) != true)
        return ;
    
    this.lastFrom = from;
    this.lastContent = content;
    this.fireEvent("onSMSArrive", json);
}