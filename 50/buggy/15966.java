@java.lang.Override
public void call(android.support.v4.util.Pair<org.unicef.rapidreg.model.Case, retrofit2.Response<com.google.gson.JsonElement>> pair) {
    getView().setProgressIncrease();
    increaseSyncNumber();
    updateRecordSynced(pair.first, true);
}