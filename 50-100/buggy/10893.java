public void setName(eu.etaxonomy.cdm.model.name.TaxonName name) {
    if (((this.name) != null) && (!(this.name.equals(name)))) {
        if (name != null) {
            name.getRegistrations().remove(this);
        }
    }
    this.name = name;
    this.name.getRegistrations().add(this);
}