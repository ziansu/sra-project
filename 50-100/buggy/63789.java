public void callback(fr.utt.adrien.helloworld.LoginActivity loginActivity) {
    fr.utt.adrien.helloworld.utils.RequestHandler.AuthentificationActivityWrapper wrapper = callbacks.remove(loginActivity.getIntent().getIntExtra("CALLBACK_ID", (-1)));
    if (wrapper != null) {
        if (isAuthentified()) {
            wrapper.handler.onAuthentified();
        }
    }else {
        android.util.Log.d("RequestHandler", "Missing callback");
    }
}