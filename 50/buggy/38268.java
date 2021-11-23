public java.util.List<org.woehlke.jee6.petclinic.entities.Vet> getVets() {
    if ((this.vets) == null) {
        this.vets = vetDao.getAll();
    }
    return this.vets;
}