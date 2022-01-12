private void cryptActionSelect(com.example.sonya.grouplockapplication.LibraryActivity.LibraryState state) {
    if ((state != (com.example.sonya.grouplockapplication.LibraryActivity.LibraryState.ENCRYPT_SELECTING)) && (state != (com.example.sonya.grouplockapplication.LibraryActivity.LibraryState.DECRYPT_SELECTING))) {
        return ;
    }
    if (state == (com.example.sonya.grouplockapplication.LibraryActivity.LibraryState.ENCRYPT_SELECTING)) {
        getSupportActionBar().setTitle(R.string.action_encrypt);
    }else {
        getSupportActionBar().setTitle(R.string.action_decrypt);
    }
    setMenuVisible(false);
    currentLibraryState = state;
    btnLoadFile.setVisibility(View.INVISIBLE);
    btnNext.setVisibility(View.VISIBLE);
    btnNext.setEnabled(false);
    showDirectoryLayout(currentDirectory);
}