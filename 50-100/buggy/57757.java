public void setRue(java.lang.String rue) {
    com.bam.GESTIBANKBAM.model.Adresse a = getAdresse();
    if (a == null) {
        a = new com.bam.GESTIBANKBAM.model.Adresse();
    }else {
        a = new com.bam.GESTIBANKBAM.model.Adresse(a.getNumero(), rue, a.getVille(), a.getCodePostal(), a.getTelephone(), a.getMail());
    }
    setAdresse(a);
}