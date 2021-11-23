@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.loganfreeman.utahfishing.modules.main.ui.ReportFilterActivity.RESULT_CODE)) {
        java.lang.String filter = data.getStringExtra("MESSAGE");
        com.loganfreeman.utahfishing.modules.main.ui.StockReportListActivity.start(getActivity(), simpleRecyclerViewAdapter.filterByCounty(filter));
    }
}