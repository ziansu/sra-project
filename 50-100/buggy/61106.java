public void delete(long id) {
    if (id == (io.keepcoding.rgs.everpobre.model.db.dao.NotebookDAO.INVALID_ID_DELETE_ALL_RECORDS)) {
        db.getWritableDatabase().delete(DBConstants.TABLE_NOTEBOOK, null, null);
    }else {
        db.getWritableDatabase().delete(DBConstants.TABLE_NOTEBOOK, (((io.keepcoding.rgs.everpobre.model.db.DBConstants.KEY_NOTEBOOK_ID) + " = ") + id), null);
    }
    db.close();
    db = null;
}