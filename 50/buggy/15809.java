@java.lang.Override
public void run() {
    readUzuki();
    mHandler.postDelayed(this, 1000);
}