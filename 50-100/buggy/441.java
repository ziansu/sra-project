@java.lang.Override
public void onClick(android.view.View v) {
    if (!(mFileManager.searchFile(attachment.getFilename()))) {
        mFileManager.downloadFile(attachment.getFilename(), attachment.getFileurl(), "", crux.bphc.cms.fragments.ForumFragment.FOLDER_NAME);
    }else {
        mFileManager.openFile(attachment.getFilename(), crux.bphc.cms.fragments.ForumFragment.FOLDER_NAME);
    }
}