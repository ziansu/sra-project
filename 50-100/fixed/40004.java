public instancefactory.service.MyArrayList<instancefactory.service.Eintrag> getWerte() {
    if ((this.werte) == null) {
        this.werte = new instancefactory.service.MyArrayList();
        instancefactory.service.Eintrag eintrag = new instancefactory.service.Eintrag();
        eintrag.node = null;
        eintrag.value = 0;
        this.werte.add(eintrag);
        calculateValues(this.partition, this.ordering);
        werte.remove(0);
    }
    return werte;
}