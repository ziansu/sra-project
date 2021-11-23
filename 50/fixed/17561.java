public chevalierx.kiwapp.models.EvenementCouleur getCouleur() {
    for (chevalierx.kiwapp.models.EvenementCouleur evenementCouleur : chevalierx.kiwapp.models.DAO.EvenementCouleurDAO.getEvenementCouleurList()) {
        if ((evenementCouleur.getId()) == (couleur)) {
            return evenementCouleur;
        }
    }
    return null;
}