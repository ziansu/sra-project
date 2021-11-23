public void startSearch(java.lang.String query, java.lang.String filter) {
    com.google.appinventor.client.editor.youngandroid.JsArray object = com.google.appinventor.client.editor.youngandroid.BlocklyPanel.doStartSearch(formName, query, filter);
    try {
        int count = object.getSize();
        if (count == 0) {
            com.google.appinventor.client.ErrorReporter.reportInfo("No results found");
        }
    } catch (java.lang.Exception e) {
    }
}