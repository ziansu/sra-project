public void cleanDataStore() {
    if (!(this.isApplicationReady())) {
        return ;
    }
    try {
        eu.focusnet.app.model.store.SampleDao dao = this.databaseAdapter.getSampleDao();
        dao.cleanTable();
    } finally {
        this.databaseAdapter.close();
    }
}