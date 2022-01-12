private java.lang.String getMklHash(com.rakuten.rit.roma.romac4j.connection.Connection con) {
    com.rakuten.rit.roma.romac4j.Receiver rcv = new com.rakuten.rit.roma.romac4j.StringReceiver();
    try {
        con.write("mklhash 0");
        rcv.receive(con);
        returnConnection(con);
    } catch (java.lang.Exception e) {
        com.rakuten.rit.roma.romac4j.routing.Routing.log.error("getMklHash() : ", e);
        failCount(con);
        return null;
    }
    return rcv.toString();
}