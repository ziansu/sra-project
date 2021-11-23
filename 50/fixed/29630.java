public void startBinding() {
    android.content.Intent mIntent = new android.content.Intent(this, com.captncript.dadsRadio.DadsPlayer.class);
    try {
        bindService(mIntent, mConnection, Context.BIND_AUTO_CREATE);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
}