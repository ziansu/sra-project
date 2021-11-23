@java.lang.Override
public void run() {
    startActivity(intent);
    overridePendingTransition(0, 0);
    finish();
}