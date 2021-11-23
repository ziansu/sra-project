@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    new com.oneafricamedia.classifieds.ui.MainActivity.FetchData().execute();
    swipeStack = ((com.oneafricamedia.classifieds.widget.swipestack.SwipeStack) (findViewById(R.id.swipeStack)));
    swipeStack.setListener(this);
    swipeStack.setSwipeProgressListener(this);
}