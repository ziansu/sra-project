@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.callLogList = this.fetchInboxSms(2);
    if ((this.callLogList) != null) {
        mAdapter = new android.widget.ArrayAdapter<java.lang.String>(this, android.R.layout.simple_list_item_1, callLogList);
        setListAdapter(mAdapter);
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "The list is Empty, add one please ", Toast.LENGTH_SHORT).show();
    }
    setContentView(R.layout.activity_loglist);
}