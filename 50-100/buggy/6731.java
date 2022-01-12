public boolean gelijkAan(nl.detoren.ijc.data.groepen.Speler speler) {
    return (((this.getNaam().equals(speler.getNaam())) && (this.getInitialen().equals(speler.getInitialen()))) && ((this.getGroep()) == (speler.getGroep()))) && ((this.getKNSBnummer()) == (speler.getKNSBnummer()));
}