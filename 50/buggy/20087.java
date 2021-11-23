@java.lang.Override
public void processServer(java.lang.String data, java.net.Socket client, java.lang.String time, com.lms.network.TCPServerInterface tcp) {
    java.lang.System.out.println(data);
    tcp.broadcast(client, java.lang.String.format("%c%s", com.lms.network.NetworkEventBuff.headerCode, data));
}