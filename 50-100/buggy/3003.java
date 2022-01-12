public void Logout() {
    new android.app.AlertDialog.Builder(this).setTitle("Съобщение?").setMessage("Сигурни ли сте, че искате да излезете от профила си?").setPositiveButton(android.R.string.yes, new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int which) {
            startActivity(new android.content.Intent(com.inst.mobileinstitutions.ProfileActivity.this, com.inst.mobileinstitutions.HomeActivity.class));
        }
    }).setNegativeButton(android.R.string.no, new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int which) {
        }
    }).setIcon(android.R.drawable.ic_dialog_alert).show();
}