public void init() {
    if (!(acceptThreadRunning)) {
        net.ballmerlabs.scatterbrain.network.bluetooth.ScatterAcceptThread acceptThread = new net.ballmerlabs.scatterbrain.network.bluetooth.ScatterAcceptThread(trunk, adapter);
        acceptThread.start();
    }
}