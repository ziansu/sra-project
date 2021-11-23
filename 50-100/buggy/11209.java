private void traiterEmail(java.lang.String email, com.tut.beans.Utilisateur utilisateur) {
    try {
        validationEmail(email);
    } catch (java.lang.Exception e) {
        setErreur(com.tut.forms.ConnexionForm.CHAMP_IDF, e.getMessage());
    }
    utilisateur = utilisateurDao.trouver(email);
    if (utilisateur == null) {
        setErreur(com.tut.forms.ConnexionForm.CHAMP_IDF, "Utilisateur inconnu");
        java.lang.System.out.println("traiterEmail() --> Echec de l'inscription : utilisateur non stocké en base de données");
    }
}