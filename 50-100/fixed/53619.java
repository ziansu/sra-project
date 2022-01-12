@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mAdapter = new com.alphabet.alphabetsdklib.uitls.CommonBaseAdapter<com.alphabet.alphabetsdk.MainActivity.ActivityBean>(this, com.alphabet.alphabetsdk.MainActivity.sActivityBeanList, new int[]{ R.layout.common_adpter_item }) {
        @java.lang.Override
        public void convert(com.alphabet.alphabetsdklib.uitls.ViewHolder viewHolder, int type, com.alphabet.alphabetsdk.MainActivity.ActivityBean activityBean) {
            viewHolder.setText(R.id.title_tv, activityBean.getTitle()).setText(R.id.content_tv, activityBean.getDesc());
        }
    };
    setListAdapter(mAdapter);
}