public void adaugaSectie(java.lang.Integer id, java.lang.String nume, java.lang.Integer nrLoc) {
    domain.Sectie sectie = new domain.Sectie(id, nume, nrLoc);
    try {
        sValidator.validateEntity(sectie);
    } catch (java.lang.Exception e) {
        if ((e.getMessage()) != null) {
            java.lang.System.out.println(e.getMessage());
            return ;
        }
    }
    this._repoS.add(sectie);
}