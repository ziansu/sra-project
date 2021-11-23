public void onClick(android.content.DialogInterface dialog, int which) {
    android.content.Intent i = new android.content.Intent(this, demo.kolorob.kolorobdemoversion.activity.PlaceChoiceActivity.class);
    startActivity(i);
    dialog.dismiss();
    finish();
}