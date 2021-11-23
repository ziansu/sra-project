@java.lang.Override
public void onClick(android.view.View view) {
    android.support.design.widget.Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    android.content.Intent intentLogin = new android.content.Intent(this, com.leptonsoftware.route.MainActivity.class);
    startActivity(intentLogin);
}