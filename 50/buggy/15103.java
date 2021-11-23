void sendCode(java.lang.String code, android.content.Context context, com.mooo.ewolvy.uppidown.AASuper aaState, android.widget.ImageView iv) {
    codeToSend = code;
    com.mooo.ewolvy.uppidown.SSLServer.doConnection connection = new com.mooo.ewolvy.uppidown.SSLServer.doConnection();
    connection.execute(context);
    currentAAState = aaState;
    onOffSign = iv;
}