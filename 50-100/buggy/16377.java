public void commit(server.ServerID server, java.lang.Integer stamp, java.lang.Integer CSN) {
    for (message.Write w : this.writes) {
        if ((w.server().equals(server)) && (w.stamp().equals(stamp))) {
            w.setCSN(CSN);
        }
    }
    java.util.Collections.sort(this.writes);
}