public void addProdukt() {
    try {
        getNewProdukt().setPnr(createPnr());
        if (!(stuecklisteCB)) {
            getNewProdukt().setBauteile(null);
        }
        getProduktService().addProdukt(getNewProdukt());
    } catch (org.springframework.dao.DataAccessException e) {
        e.printStackTrace();
    }
    init();
}