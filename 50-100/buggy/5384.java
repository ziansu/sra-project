@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    tvDisplay = ((android.widget.TextView) (findViewById(R.id.tvDisplay)));
    btnPre = ((android.widget.Button) (findViewById(R.id.btnPre)));
    btnNext = ((android.widget.Button) (findViewById(R.id.btnNext)));
    btnNext.setOnClickListener(this);
    loadBook();
    loadPage();
}