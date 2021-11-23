public void run() {
    if (getResponse().equals("login_200_FOUND")) {
        onLoginSuccess();
    }else
        if (getResponse().equals("login_404_NOTFOUND")) {
            onLoginFailed();
        }
    
    progressDialog.dismiss();
}