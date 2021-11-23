public void update(com.mycompany.myapp.ListeDTO liste) {
    mDb.rawQuery(((((((("update " + (MyListDBHandler.LIST_TABLE_NAME)) + " set ") + (MyListDBHandler.LIST_DESCRIPTION)) + " = ?") + " where ") + (MyListDBHandler.LIST_ID)) + " = ?"), new java.lang.String[]{ liste.getDescription() , java.lang.String.valueOf(liste.getId()) });
}