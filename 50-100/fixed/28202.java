public void updateNet(java.util.ArrayList<application.model.Chaine> listeChaine) {
    this.net = this.cash;
    for (application.model.TypeChaine c : this.actionParChaine.keySet()) {
        if ((listeChaine.get(((c.getNumero()) - 2)).tailleChaine()) > 0) {
            this.net += this.getPrime(c, listeChaine.get(((c.getNumero()) - 2)).tailleChaine(), true);
        }
    }
}