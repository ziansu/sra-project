@java.lang.Override
public void onDataFetchComplete(java.lang.Throwable throwable, java.lang.String parser) {
    if (parser.equals(AppState.MOD_NEWS)) {
        if ((!(this.isDetached())) && (this.isVisible())) {
            this.loadPages();
        }
        com.untappedkegg.rally.data.DbUpdated.open();
        com.untappedkegg.rally.data.DbUpdated.updated_insert(parser);
        com.untappedkegg.rally.data.DbUpdated.close();
    }
}