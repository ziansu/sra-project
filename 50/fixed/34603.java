public int add(net.ukrtel.ddns.ff.Appliant appliant) {
    int result;
    synchronized(list) {
        list.add(appliant);
        result = list.size();
    }
    appliant.setId((result - 1));
    return result;
}