public void showWarningToUser(android.os.Message msg) {
    android.content.Intent intent = new android.content.Intent(this, com.juliansparber.vpnMITM.UserAlertDialog.class);
    intent.addFlags((((android.content.Intent.FLAG_ACTIVITY_REORDER_TO_FRONT) | (android.content.Intent.FLAG_ACTIVITY_NEW_TASK)) | (android.content.Intent.FLAG_ACTIVITY_NEW_DOCUMENT)));
    intent.putExtra(UserAlertDialog.PAYLOAD, ((java.lang.String[]) (msg.obj)));
    startActivity(intent);
}