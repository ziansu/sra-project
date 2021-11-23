@java.lang.Override
public void run() {
    if (connectingIsCanceled) {
        connectingIsCanceled = false;
    }else {
        stopServiceDiscovery();
        if (foundDevices.isEmpty()) {
            cleanUpFunction.call();
        }else {
            devicesFound.call();
        }
    }
}