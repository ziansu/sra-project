@java.lang.Override
public void onClick(cn.pedant.SweetAlert.SweetAlertDialog sDialog) {
    sDialog.dismiss();
    android.content.Intent i = new android.content.Intent(this, com.intbridge.projects.gaucholife.MainActivity.class);
    i.putExtra("DATASOURCE", false);
    i.putExtra("CLEANLOCAL", false);
    startActivity(i);
    finish();
}