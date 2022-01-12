@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((nouveauFichier.getSelectedFile()) != null) {
        ctrl.creerProjet(nouveauFichier.getSelectedFile().getPath().substring(0, ((nouveauFichier.getSelectedFile().getPath().length()) - (nouveauFichier.getSelectedFile().getName().length()))), nouveauFichier.getSelectedFile().getName());
        actualiserTitre();
        ctrl.remettreAZero();
    }
}