@java.lang.Override
public void start(java.net.InetAddress hostAddress) throws java.io.IOException {
    if (mRunningFlag) {
        throw new java.lang.UnsupportedOperationException();
    }
    try {
        mServer.start();
        mServer.bind(io.github.antijava.marjio.network.NET_TCP_PORT, io.github.antijava.marjio.network.NET_UDP_PORT);
        mServer.addListener(new io.github.antijava.marjio.network.ClientReceiver(mApplication));
        mClient.start();
        mClient.connect(io.github.antijava.marjio.network.NET_TIMEOUT, hostAddress, io.github.antijava.marjio.network.NET_TCP_PORT, io.github.antijava.marjio.network.NET_UDP_PORT);
        mRunningFlag = true;
    } catch (java.io.IOException e) {
        throw e;
    }
}