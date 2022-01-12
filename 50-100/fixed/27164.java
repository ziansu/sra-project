@java.lang.Override
public void onResponse(retrofit.Response<com.projects.nosleepproject.models.ListingsModel> response) {
    try {
        java.lang.String after = response.body().getData().getAfter();
        mDbHelper.loadTable(response.body(), contentArray, table);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        scrollLoading = false;
    }
}