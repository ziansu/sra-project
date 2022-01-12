@java.lang.Override
public void run() {
    if (connectingIsCanceled) {
        connectingIsCanceled = false;
    }else {
        if (foundDevices.isEmpty()) {
            stopServiceDiscovery();
            cleanUpFunction.call();
        }else {
            devicesFound.call();
        }
    }
}