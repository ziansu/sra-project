public void deleteNiveau() {
    try {
        q.delete(selectedNiveau);
        generateListNiveau();
        m.success("Suppression termin� avec succ�s");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        session.close();
        buildSession();
        m.error("Erreur de suppression !! Contactez l'administrateur");
    }
}