public void setName(eu.etaxonomy.cdm.model.name.TaxonName name) {
    if (((this.name) != null) && (!(this.name.equals(name)))) {
        this.name.getRegistrations().remove(this);
    }
    if ((name != null) && (!(name.equals(this.name)))) {
        name.getRegistrations().add(this);
    }
    this.name = name;
}