@java.lang.Override
public void run() {
    if ((timerTrigger) == 1) {
        findViewById(R.id.CoverImage).setVisibility(View.GONE);
    }else
        if (existedUser) {
            Proceed();
        }else {
            (timerTrigger)++;
        }
    
}