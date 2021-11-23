public void add(net.ukrtel.ddns.ff.Appliant appliant) {
    list.add(appliant);
    appliant.setId(((list.size()) - 1));
}