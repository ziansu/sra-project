public model.BayesianModel setPartner(model.BayesianModel partner) {
    if (partner == null) {
        return null;
    }
    this.partner = partner;
    if (((partner.getPartner()) == null) || (!(partner.getPartner().equals(this)))) {
        partner.setPartner(this);
        if (java.lang.Double.isNaN(this.value)) {
            this.setValue((1.0 - (partner.getValue())));
        }
    }
    return partner;
}