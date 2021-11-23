public instancefactory.service.MyArrayList<instancefactory.service.Eintrag> getWerte() {
    if ((this.werte) == null) {
        werte = new instancefactory.service.MyArrayList();
        instancefactory.service.Eintrag eintrag = new instancefactory.service.Eintrag();
        eintrag.node = null;
        eintrag.value = 0;
        werte.add(eintrag);
        calculateValues(partition, ordering);
        werte.remove(0);
    }
    return werte;
}