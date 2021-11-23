@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.buttonRestart :
            start();
            break;
        case R.id.buttonStop :
            stop();
            break;
    }
}