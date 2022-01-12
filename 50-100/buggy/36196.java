public void adaugaSectie(java.lang.Integer id, java.lang.String nume, java.lang.Integer nrLoc) {
    domain.Sectie sectie = new domain.Sectie(id, nume, nrLoc);
    try {
        sValidator.validateEntity(sectie);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
    }
    this._repoS.add(sectie);
}