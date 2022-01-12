@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_common_adater);
    for (int i = 0; i < 20; i++) {
        mBeanList.add(new com.alphabet.alphabetsdk.CommonAdapterActivity.Bean(("Title_" + i), ("Desc_" + i)));
    }
    mMyAdapter = new com.alphabet.alphabetsdk.CommonAdapterActivity.MyAdapter(this, mBeanList, R.layout.common_adpter_item);
    setListAdapter(mMyAdapter);
    setListAdapter(mMyAdapter);
}