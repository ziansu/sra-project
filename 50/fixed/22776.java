@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    app.ddf.danskdatahistoriskforening.helper.SearchManager.setSearchList(null);
}