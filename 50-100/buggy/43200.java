public void adaugaCandidat(java.lang.Integer id, java.lang.String nume, java.lang.String tel, java.lang.String adresa, java.lang.Integer varsta) {
    domain.Candidat cand = new domain.Candidat(id, nume, tel, adresa, varsta);
    try {
        cValidator.validateEntity(cand);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
    }
    this._repoC.add(cand);
}