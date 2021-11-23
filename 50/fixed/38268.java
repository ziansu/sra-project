public java.util.List<org.woehlke.jee6.petclinic.entities.Vet> getVets() {
    this.vets = vetDao.getAll();
    return this.vets;
}