private java.util.ArrayList<com.bam.GESTIBANKBAM.model.Employe> populateDummyConseillers(java.util.List<com.bam.GESTIBANKBAM.model.Personne> personnes, int count) {
    java.util.ArrayList<com.bam.GESTIBANKBAM.model.Employe> agts = new java.util.ArrayList<com.bam.GESTIBANKBAM.model.Employe>();
    int idx = 0;
    final int len = personnes.size();
    com.bam.GESTIBANKBAM.model.Personne p;
    for (int i = 0; (i < count) && (idx < len); i++) {
        p = personnes.get((idx++));
        agts.add(createNewConseiller(p));
    }
    return agts;
}