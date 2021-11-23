@java.lang.Override
public void run() {
    if (gruppe3.convoy.functionality.SingleTon.dataLoadDone) {
    }else {
        h.postDelayed(this, 100);
    }
}