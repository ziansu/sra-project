void sendCode(java.lang.String code, android.content.Context context, com.mooo.ewolvy.uppidown.AASuper aaState, android.widget.ImageView iv) {
    codeToSend = code;
    currentAAState = aaState;
    com.mooo.ewolvy.uppidown.SSLServer.doConnection connection = new com.mooo.ewolvy.uppidown.SSLServer.doConnection();
    connection.execute(context);
    onOffSign = iv;
}