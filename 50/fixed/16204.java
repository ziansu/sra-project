@java.lang.Override
public void run() {
    if (!(mIsStartService.get())) {
        gatt.disconnect();
    }
}