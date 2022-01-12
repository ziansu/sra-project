public void setTelephone(java.lang.String telephone) {
    com.bam.GESTIBANKBAM.model.Adresse a = getAdresse();
    if (a == null) {
        a = new com.bam.GESTIBANKBAM.model.Adresse();
    }else {
        a = new com.bam.GESTIBANKBAM.model.Adresse(a.getNumero(), a.getRue(), a.getVille(), a.getCodePostal(), telephone, a.getMail());
    }
    setAdresse(a);
}