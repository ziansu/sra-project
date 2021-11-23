void sendSetup(me.legrange.swap.ModemSetup setup) {
    synchronized(out) {
        out.write(me.legrange.swap.tcp.TcpTransport.SETUP_START);
        out.write(java.lang.String.format("%s=%d,", me.legrange.swap.tcp.TcpTransport.SETUP_DEVICE_ADDRESS, setup.getDeviceAddress()));
        out.write(java.lang.String.format("%s=%d,", me.legrange.swap.tcp.TcpTransport.SETUP_CHANNEL, setup.getChannel()));
        out.write(java.lang.String.format("%s=%d", me.legrange.swap.tcp.TcpTransport.SETUP_NETWORK_ID, setup.getNetworkID()));
        out.write("\n");
        out.flush();
    }
}