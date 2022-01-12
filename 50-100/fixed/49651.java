public void setVille(java.lang.String ville) {
    com.bam.GESTIBANKBAM.model.Adresse a = getAdresse();
    if (a == null) {
        a = new com.bam.GESTIBANKBAM.model.Adresse();
        a.setVille(ville);
    }else {
        a = new com.bam.GESTIBANKBAM.model.Adresse(a.getNumero(), a.getRue(), ville, a.getCodePostal(), a.getTelephone(), a.getMail());
    }
    setAdresse(a);
}