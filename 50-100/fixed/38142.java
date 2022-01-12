public void actionPerformed(java.awt.event.ActionEvent arg0) {
    try {
        if (Controleur.ControleurPartie.controleurNbActions(idBateau)) {
            deplacerBateau1(dirBateau, ((type) + 1));
            Controleur.ControleurPartie.jouerAction(Controleur.ControleurPartie.Deplacement(idBateau, TypeDeplacement.AVANCER));
        }
    } catch (java.lang.Exception e) {
        javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}