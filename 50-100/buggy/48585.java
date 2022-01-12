public void showGetGoalDialog() {
    android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(this);
    builder.setTitle("ゴール！").setMessage("目標文字数に到達しました。").setPositiveButton(R.string.OK, new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
        }
    });
    android.support.v7.app.AlertDialog dialog = builder.create();
    dialog.show();
}