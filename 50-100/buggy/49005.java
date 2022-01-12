@java.lang.Override
public void onDataFetchComplete(java.lang.Throwable throwable, java.lang.String parser) {
    if (parser.equalsIgnoreCase(AppState.FUNC_RA_STAND)) {
        this.showPage();
        if (throwable == null) {
            com.untappedkegg.rally.data.DbUpdated.open();
            com.untappedkegg.rally.data.DbUpdated.updated_insert(((com.untappedkegg.rally.AppState.MOD_STAND) + (fileName)));
            com.untappedkegg.rally.data.DbUpdated.close();
        }
    }
}