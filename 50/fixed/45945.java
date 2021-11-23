public void showVerifySuccess() {
    sendsmscode.setClickable(false);
    new java.lang.Thread(runnable).start();
    taskHandler.postDelayed(runnable, com.lcc.msdq.login.FragmentRegister.DELAY_MILLIS);
}