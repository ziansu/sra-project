@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_search :
            break;
        case R.id.action_filter :
            startActivityForResult(com.loganfreeman.utahfishing.modules.main.ui.ReportFilterActivity.getIntent(getActivity(), simpleRecyclerViewAdapter.getFilter()), com.loganfreeman.utahfishing.modules.main.ui.ReportFilterActivity.RESULT_CODE);
            break;
        default :
            break;
    }
    return false;
}