public com.tut.beans.Utilisateur connecterUtilisateur(javax.servlet.http.HttpServletRequest request) {
    java.lang.String email = getValeurChamp(request, com.tut.forms.ConnexionForm.CHAMP_IDF);
    java.lang.String motDePasse = getValeurChamp(request, com.tut.forms.ConnexionForm.CHAMP_PASS);
    com.tut.beans.Utilisateur utilisateur = new com.tut.beans.Utilisateur();
    utilisateur = traiterEmail(email, utilisateur);
    traiterMotDePasse(motDePasse, utilisateur);
    if (erreurs.isEmpty()) {
        resultat = "Succès de la connexion.";
    }else {
        resultat = "Echec de la connexion";
    }
    return utilisateur;
}