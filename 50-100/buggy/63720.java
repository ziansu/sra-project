@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String newURL = serverURLView.getText().toString();
    java.lang.String oldURL = org.kawanfw.sql.api.client.android.AceQLDBManager.getServerUrl();
    if (!(newURL.equals(oldURL))) {
        org.kawanfw.sql.api.client.android.AceQLDBManager.initialize(newURL, null, null);
    }
    saveInputConfigurations();
    android.content.Intent intent = new android.content.Intent(this, com.kaushiknath.viandsystem.SelectionProcess.class);
    intent.putExtra("val", hd);
    startActivity(intent);
}