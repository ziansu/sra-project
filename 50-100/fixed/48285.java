private void ajouterAnnuler() {
    javax.swing.ImageIcon annulerIcone = new javax.swing.ImageIcon(Plateau.class.getResource("images/annuler.png"));
    annuler = new javax.swing.JButton(annulerIcone);
    annuler.setBackground(sable);
    annuler.setActionCommand("annuler");
    annuler.addActionListener(new Plateau.Action());
    if (!(dejaAjoutAnnuler)) {
        (capaciteListe)++;
        PersoPane.add(annuler);
        listeBoutons[capaciteListe] = annuler;
        dejaAjoutAnnuler = true;
    }
}