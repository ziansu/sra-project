@java.lang.Override
public void onBackPressed() {
    if (canGoToParent(currentDirectory)) {
        showDirectoryLayout(new com.example.sonya.grouplockapplication.LibraryEntry(currentDirectory.getParent()));
    }else {
        handleUpAction();
    }
}