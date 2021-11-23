public static void main(java.lang.String[] args) {
    com.tdigestclient.TDigestClient tc = new com.tdigestclient.TDigestClient(args[0], java.lang.Integer.parseInt(args[1]));
    tc.connection();
    tc.getPercentile(0.9);
    tc.quitConnection();
}