public void actionPerformed(java.awt.event.ActionEvent arg0) {
    try {
        if (Controleur.ControleurPartie.controleurNbActions(idBateau)) {
            Controleur.ControleurPartie.jouerAction(Controleur.ControleurPartie.Deplacement(idBateau, TypeDeplacement.AVANCER));
            deplacerBateau1(dirBateau, ((type) + 1));
        }
    } catch (java.lang.Exception e) {
        javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}