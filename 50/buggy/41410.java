@java.lang.Override
public void onBackPressed() {
    if (canGoToParent(currentDirectory)) {
        showDirectoryLayout(new com.example.sonya.grouplockapplication.LibraryEntry(currentDirectory.getEntry().getParent()));
    }else {
        handleUpAction();
    }
}