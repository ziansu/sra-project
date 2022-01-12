private void setAdapterView(java.util.ArrayList<br.com.android.pocapp.domain.BootInfo> list) {
    mAdapter = new br.com.android.pocapp.view.adapter.BootAdapter(list);
    if ((list.size()) == 0) {
        mRecView.setVisibility(View.GONE);
        mBootActivity.findViewById(R.id.empty_list).setVisibility(View.VISIBLE);
        mRecView.setAdapter(mAdapter);
    }else {
        mRecView.setVisibility(View.VISIBLE);
        mBootActivity.findViewById(R.id.empty_list).setVisibility(View.GONE);
        mRecView.setAdapter(mAdapter);
    }
}