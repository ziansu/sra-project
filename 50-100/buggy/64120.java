protected void insertPaste(java.lang.String cLabel, java.lang.String cText, int cIcon) {
    com.nicfol.duplici.PasteListSingleton.db = new com.nicfol.duplici.DBHelper(com.nicfol.duplici.PasteListSingleton.appContext);
    com.nicfol.duplici.PasteListSingleton.db.insertPasteToDb(cLabel, cText, cIcon);
    com.nicfol.duplici.Paste tempPaste = new com.nicfol.duplici.Paste(((com.nicfol.duplici.PasteListSingleton.db.getLastInsertID()) + 1), cLabel, cText, cIcon);
    com.nicfol.duplici.PasteListSingleton.pasteList.add(tempPaste);
    notifyChanges();
    com.nicfol.duplici.PasteListSingleton.db.close();
}