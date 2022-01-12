private void traiterMotDePasse(java.lang.String motDePasse, com.tut.beans.Utilisateur utilisateur) {
    try {
        validationMotDePasse(motDePasse);
    } catch (java.lang.Exception e) {
        setErreur(com.tut.forms.ConnexionForm.CHAMP_PASS, e.getMessage());
    }
    if (utilisateur != null) {
        org.jasypt.util.password.ConfigurablePasswordEncryptor passwordEncryptor = new org.jasypt.util.password.ConfigurablePasswordEncryptor();
        passwordEncryptor.setAlgorithm(com.tut.forms.ConnexionForm.ALGO_CHIFFREMENT);
        passwordEncryptor.setPlainDigest(false);
        if (!(passwordEncryptor.checkPassword(motDePasse, utilisateur.getMotDePasse()))) {
            setErreur(com.tut.forms.ConnexionForm.CHAMP_PASS, "Mot de passe incorrect");
        }
    }
}