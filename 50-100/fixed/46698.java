public void onRecieveIntent(android.content.Intent intent) {
    if ((this.auth) == null)
        return ;
    
    this.token = this.auth.handleCallbackData(intent);
    if ((this.token) != null) {
        this.token.saveTokenDetails(this.context);
    }
    this.auth = null;
}