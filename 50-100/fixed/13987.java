@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e == null) {
        setResult(com.zilche.zilche.RESULT_OK);
        finish();
        overridePendingTransition(0, R.anim.left_to_right);
    }else {
        android.widget.Toast.makeText(this, getString(R.string.connection_err), Toast.LENGTH_SHORT).show();
        dialog.dismiss();
    }
}