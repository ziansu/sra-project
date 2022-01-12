@java.lang.Override
public void onClick(android.view.View view) {
    if (com.door43.util.SdUtils.doWeNeedToRequestSdCardAccess()) {
        new android.support.v7.app.AlertDialog.Builder(this, R.style.AppTheme_Dialog).setTitle(R.string.enable_sd_card_access_title).setMessage(R.string.enable_sd_card_access).setPositiveButton(R.string.confirm, new android.content.DialogInterface.OnClickListener() {
            @java.lang.Override
            public void onClick(android.content.DialogInterface dialog, int which) {
                com.door43.util.SdUtils.triggerStorageAccessFramework(com.door43.translationstudio.ui.filechooser.FileChooserActivity.this);
            }
        }).setNegativeButton(R.string.label_skip, null).show();
    }else {
        showFolderFromSdCard();
    }
}