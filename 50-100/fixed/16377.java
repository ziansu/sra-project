public void commit(server.ServerID server, int stamp, int CSN) {
    for (message.Write w : this.writes) {
        if ((w.server().equals(server)) && ((w.stamp()) == stamp)) {
            w.setCSN(CSN);
        }
    }
    java.util.Collections.sort(this.writes);
}