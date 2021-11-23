public void setMail(java.lang.String mail) {
    com.bam.GESTIBANKBAM.model.Adresse a = getAdresse();
    if (a == null) {
        a = new com.bam.GESTIBANKBAM.model.Adresse();
    }else {
        a = new com.bam.GESTIBANKBAM.model.Adresse(a.getNumero(), a.getRue(), a.getVille(), a.getCodePostal(), a.getTelephone(), mail);
    }
    setAdresse(a);
}