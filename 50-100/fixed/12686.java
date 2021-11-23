@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_first);
    mBookRide = ((android.widget.Button) (findViewById(R.id.book_ride)));
    mRegister = ((android.widget.Button) (findViewById(R.id.register_now)));
    mBookRide.setOnClickListener(this);
    mRegister.setOnClickListener(this);
}