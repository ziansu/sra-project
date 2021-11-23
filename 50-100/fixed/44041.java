@java.lang.Override
public void connectFailed(java.net.URI uri, java.net.SocketAddress sa, java.io.IOException ioe) {
    java.net.InetSocketAddress socketAddress = ((java.net.InetSocketAddress) (sa));
    failures.add(okhttp3.internal.Util.format("%s %s:%d %s", uri, socketAddress, socketAddress.getPort(), ioe.getMessage()));
}