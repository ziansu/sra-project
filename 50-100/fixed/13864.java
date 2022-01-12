@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if ((requestCode == (org.wordpress.android.editor.LegacyEditorFragment.ACTIVITY_REQUEST_CODE_CREATE_LINK)) && (data != null)) {
        android.os.Bundle extras = data.getExtras();
        if (extras == null) {
            return ;
        }
        java.lang.String linkURL = extras.getString("linkURL");
        java.lang.String linkText = extras.getString("linkText");
        createLinkFromSelection(linkURL, linkText);
    }
}