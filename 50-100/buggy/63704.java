public void setClub2(int club2) throws java.lang.IllegalArgumentException {
    boolean ok = false;
    for (model.Club c : this.listeClub) {
        if ((c.getId()) == (club1)) {
            this.club2 = club2;
            ok = true;
        }
    }
    if (!ok) {
        throw new java.lang.IllegalArgumentException((club2 + " : id non compris dans la division"));
    }
}