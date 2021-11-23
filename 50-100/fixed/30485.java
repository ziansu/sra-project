public void setCodePostal(java.lang.String codePostal) {
    com.bam.GESTIBANKBAM.model.Adresse a = getAdresse();
    if (a == null) {
        a = new com.bam.GESTIBANKBAM.model.Adresse();
        a.setCodePostal(codePostal);
    }else {
        a = new com.bam.GESTIBANKBAM.model.Adresse(a.getNumero(), a.getRue(), a.getVille(), codePostal, a.getTelephone(), a.getMail());
    }
    setAdresse(a);
}