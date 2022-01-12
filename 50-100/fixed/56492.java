@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initViews();
    initObj();
    initListeners();
    if (savedInstanceState == null)
        parseJSONData(dummyListData);
    
    challenge.code.com.listbasedapp.MainActivity.recyclerViewAdapter = new challenge.code.com.listbasedapp.RecyclerViewAdapter(this, challenge.code.com.listbasedapp.MainActivity.items);
    recyclerview.setAdapter(challenge.code.com.listbasedapp.MainActivity.recyclerViewAdapter);
}