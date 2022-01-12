@java.lang.Override
public void onSuccess(de.hdm.itprojekt.noteit.client.Notebook result) {
    de.hdm.itprojekt.noteit.client.NoteitCellBrowser.getNotebookList(result);
}