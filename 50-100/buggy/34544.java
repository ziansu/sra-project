public void setNumero(int numero) {
    com.bam.GESTIBANKBAM.model.Adresse a = getAdresse();
    if (a == null) {
        a = new com.bam.GESTIBANKBAM.model.Adresse();
    }else {
        a = new com.bam.GESTIBANKBAM.model.Adresse(numero, a.getRue(), a.getVille(), a.getCodePostal(), a.getTelephone(), a.getMail());
    }
    a.setNumero(numero);
    setAdresse(a);
}