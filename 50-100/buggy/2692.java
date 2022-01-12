public void creationChaine(java.util.ArrayList<application.model.Case> listeHotels, application.model.TypeChaine nomChaine) {
    for (application.model.Case hotelToChaine : listeHotels) {
        getListeChaine().get(((nomChaine.getNumero()) - 2)).addCase(getPlateau().getCase(hotelToChaine.getNom()));
        getPlateau().getCase(hotelToChaine.getNom()).setEtat(nomChaine.getNumero());
    }
}