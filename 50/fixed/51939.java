@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    android.content.Intent returnIntent = new android.content.Intent();
    returnIntent.putExtra(jycprogrammer.ultimatedbz.ezlapse.FullscreenCamera.EXTRA_PASS, false);
    setResult(jycprogrammer.ultimatedbz.ezlapse.RESULT_CANCELED, returnIntent);
    finish();
}