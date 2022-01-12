@java.lang.Override
public void onClick(android.view.View v) {
    isReadFolder = false;
    listBookLayout.setVisibility(View.VISIBLE);
    handleChooseFileLayout.setVisibility(View.VISIBLE);
    openBooksLayout.setVisibility(View.GONE);
    getDirectory(rootDirectory);
    showFileOptionButton(1);
}