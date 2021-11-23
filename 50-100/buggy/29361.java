@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    new com.jumboeats.kate.jumboeats.MainActivity.GetData(getApplicationContext()).execute();
    android.widget.Button createNewEvent = ((android.widget.Button) (findViewById(R.id.createNewEvent)));
    assert createNewEvent != null;
    createNewEvent.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            startActivity(new android.content.Intent(com.jumboeats.kate.jumboeats.MainActivity.this, com.jumboeats.kate.jumboeats.Pop.class));
        }
    });
}