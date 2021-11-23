@java.lang.Override
public void showLodgingList(entity.ResultLodgingList resultLodgingList) {
    loading = true;
    java.util.List<entity.ResultLodging> jj = resultLodgingList.getResultLodging();
    if (!(nextOffset.equals(resultLodgingList.getStatistics().getOffsetNext().toString()))) {
        resultLodgings.addAll(jj);
        adapter.notifyDataSetChanged();
        nextOffset = resultLodgingList.getStatistics().getOffsetNext().toString();
    }
}