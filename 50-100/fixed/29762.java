@java.lang.Override
public void onFailure(retrofit2.Call<wal.fennel.models.ResponseModel> call, java.lang.Throwable t) {
    (wal.fennel.network.WebApi.countCalls)--;
    (wal.fennel.network.WebApi.countFailedCalls)++;
    android.util.Log.i("FENNEL", ("Farm visit log onFailure.. Count Calls: " + (wal.fennel.network.WebApi.countCalls)));
    wal.fennel.utils.FennelUtils.appendDebugLog(("FarmVisitLog create Failed: " + (t.getMessage())));
    t.printStackTrace();
    wal.fennel.network.WebApi.checkSyncComplete();
}