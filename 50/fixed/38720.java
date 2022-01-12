@java.lang.Override
public void onBackPressed() {
    if (com.example.slava.lenta2.MainPresenter.shouldFinish())
        finish();
    
}