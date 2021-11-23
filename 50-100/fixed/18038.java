public void afficherListePraticien(java.util.List<modele.metier.Praticien> lesPraticiens) {
    vue.getjComboBoxpraticien().removeAllItems();
    vue.getjComboBoxpraticien().addItem("aucun");
    for (modele.metier.Praticien unPraticien : lesPraticiens) {
        vue.getjComboBoxpraticien().addItem(unPraticien);
    }
}