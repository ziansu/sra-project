public void onEvent(java.lang.String basicEvent) {
    if (basicEvent.equals(LoginCallback.LOGIN_SUCCESS)) {
        progressDialog.dismiss();
        startActivity(new android.content.Intent(this, com.randomappsinc.blanknavigationdrawer.Activities.MainActivity.class));
    }
}