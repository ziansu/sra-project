@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent intent) {
    if (requestCode == (com.github.serenatansh.cordova.plugin.dropboxchooser.DropboxChooser.DBX_CHOOSER_REQUEST)) {
        handleChooserResult(resultCode, intent);
    }else {
        super.onActivityResult(requestCode, resultCode, intent);
    }
}