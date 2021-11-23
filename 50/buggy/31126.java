@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.mycompany.CMSBHelpdesk.Settings.class);
    sharedPreference.setString(this, "oneTS", "true");
    startActivity(intent);
    finish();
}