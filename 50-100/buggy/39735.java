public void addProdukt() {
    try {
        this.newProdukt.setPnr(createPnr());
        if (!(stuecklisteCB)) {
            getNewProdukt().setBauteile(null);
        }
        getProduktService().addProdukt(this.newProdukt);
    } catch (org.springframework.dao.DataAccessException e) {
        e.printStackTrace();
    }
    init();
}