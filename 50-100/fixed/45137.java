@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.io.File clickedFile = new java.io.File(browser.getCurrentFile(), ((java.lang.String) (list.getItemAtPosition(position))));
    if (clickedFile.isDirectory()) {
        selectedFile = clickedFile;
        browser.changeCurrentFile(selectedFile);
    }
    updateActivity();
}