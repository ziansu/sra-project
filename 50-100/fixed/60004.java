public void deleteClasse() {
    try {
        q.delete(selectedClasse.getClasse());
        m.success("Suppression termin� avec succ�s");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        session.close();
        q.buildSession();
        m.error("Erreur de suppression !! Contactez l'administrateur");
    }
}