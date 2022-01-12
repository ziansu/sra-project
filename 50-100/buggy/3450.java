public static java.lang.String[] getRoles(int identifiant) {
    metier.Utilisateur utilisateur = metier.Utilisateur.getUtilisateur(identifiant);
    if (utilisateur != null) {
        int numberOfRoles = CarteAcces.Role.values().length;
        java.lang.String[] lesRoles = new java.lang.String[numberOfRoles];
        int i = 0;
        for (java.util.Map.Entry<metier.CarteAcces.Role, metier.CarteAcces> lesCartes : utilisateur.lesCartesAccesUtilisateur.entrySet()) {
            lesRoles[i] = lesCartes.getKey().toString();
            i++;
        }
        return lesRoles;
    }else
        return null;
    
}