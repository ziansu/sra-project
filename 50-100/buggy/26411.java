@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    screennumber = getIntent().getIntExtra("screenNumber", 0);
    if ((screennumber) == 0) {
        setContentView(R.layout.template3);
        doAnimate();
    }else
        if ((screennumber) == 1) {
            setContentView(R.layout.src_control);
        }
    
}