@java.lang.Override
public void onNext(work.beltran.discogsbrowser.api.model.RecordsWithPagination recordsWithPagination) {
    int range = recordList.size();
    for (work.beltran.discogsbrowser.api.model.record.Record record : recordsWithPagination.getRecords()) {
        android.util.Log.d(work.beltran.discogsbrowser.ui.main.common.RecordsAdapter.TAG, (("onNext(" + (record.getInstance_id())) + ")"));
        recordList.add(record);
    }
    notifyItemRangeInserted(range, recordsWithPagination.getRecords().size());
}