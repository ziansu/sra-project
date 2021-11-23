@org.androidannotations.annotations.AfterViews
void init() {
    customNumberList = com.pawansinghchouhan05.callcustomizer.core.utils.Utils.retriveCustomNumberListToFCMDatabase();
    mobileNumberAdapter = new com.pawansinghchouhan05.callcustomizer.home.adapters.MobileNumberAdapter(customNumberList.getCustomNumberList());
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
    recyclerView.setAdapter(mobileNumberAdapter);
    mobileNumberAdapter.notifyDataSetChanged();
}