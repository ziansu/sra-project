@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.jackleeentertainment.testrecyclerviewproject.MainActivity.initFbaseDatabase();
    com.jackleeentertainment.testrecyclerviewproject.MainActivity.initFbaseDatabaseRef();
    setContentView(R.layout.activity_main);
}