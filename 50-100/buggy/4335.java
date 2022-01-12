@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    if ((urlServerSource) != (ConnectionService.URLServerSource.IP_REQUESTED)) {
        this.loginIntent();
    }else
        if ((waitingUpdate) == false) {
            logInActivity.handleUnexpectedError("Error en la conexión");
            this.clearLoginActivityLink();
        }
    
}