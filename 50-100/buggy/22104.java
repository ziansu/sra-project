private void handleUpAction() {
    switch (currentLibraryState) {
        case BROWSING :
            this.finish();
            break;
        case ENCRYPT_SELECTING :
        case DECRYPT_SELECTING :
            if (avoidBrowsingMode) {
                this.finish();
            }else {
                setMenuVisible(true);
                getSupportActionBar().setTitle(R.string.library_activity_name);
                currentLibraryState = com.example.sonya.grouplockapplication.LibraryActivity.LibraryState.BROWSING;
                btnLoadFile.setVisibility(View.VISIBLE);
                btnNext.setVisibility(View.INVISIBLE);
                filesToOperateWith.clear();
                showDirectoryLayout(currentDirectory);
            }
            break;
    }
}