@java.lang.Override
public void onFinish() {
    if ((pd) != null) {
        if ((recordGetDone) >= 3)
            pd.dismiss();
        else
            timer.start();
        
    }
}