public int connect(java.lang.String host, int port) {
    try {
        client.connect(new java.net.InetSocketAddress(host, port), 10000);
        raw_in = client.getInputStream();
        raw_out = client.getOutputStream();
        string_in = new java.io.BufferedReader(new java.io.InputStreamReader(raw_in));
        string_out = new java.io.BufferedWriter(new java.io.OutputStreamWriter(raw_out));
        return sensitives_kuscheltier.straesgriesmayerkomon.tgm3bhit.myapplication.ClientSocket.CONNECTED;
    } catch (java.io.IOException e) {
        return sensitives_kuscheltier.straesgriesmayerkomon.tgm3bhit.myapplication.ClientSocket.CONNECTION_FAILED;
    }
}