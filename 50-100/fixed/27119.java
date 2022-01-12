@java.lang.SuppressWarnings(value = "unused")
@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (true) {
        this.goToMainActivity();
    }else {
        setContentView(R.layout.start_activity);
        main = ((android.widget.RelativeLayout) (findViewById(R.id.start_main)));
        tv = ((com.alphabets.view.CustomTextView) (findViewById(R.id.start_center)));
        this.fadeIn(com.alphabets.StartActivity.FIRST);
    }
}