public static void main(java.lang.String[] args) {
    com.tdigestclient.TDigestClient tc = new com.tdigestclient.TDigestClient(args[1], java.lang.Integer.parseInt(args[2]));
    tc.connection();
    tc.getPercentile(0.9);
    tc.quitConnection();
}