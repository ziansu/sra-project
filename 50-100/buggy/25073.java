@java.lang.Override
public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
    if ((foundBooks.size()) == 0) {
        showDialogErrorReadFile((("Can't find any books match with '" + (searchText)) + "'"));
    }else {
        if (showGridView)
            viewBookInformationInScreenAsGrid(foundBooks, 1);
        else
            viewBookInformationInScreenAsList(foundBooks, 1);
        
        showDialogSuccessReadFile(((("Found " + (foundBooks.size())) + " books with name ") + (searchText)));
    }
    progress.dismiss();
}