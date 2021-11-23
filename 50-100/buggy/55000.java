private void showMenuDialog() {
    android.app.AlertDialog dialog = new android.app.AlertDialog.Builder(this, R.style.AppDialogTheme).setTitle(R.string.menu).setItems(R.array.menu_items, new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
            if (which == 0) {
                startActivity(new android.content.Intent(ca.yyx.hu.SettingsActivity.this, ca.yyx.hu.VideoTestActivity.class));
            }
        }
    }).create();
    dialog.show();
}