@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String nom = tNom.getText();
    if ((nom.equals(((inscriptions_metier.Equipe) (equipe)).getNom())) == false) {
        req.updateEquipe(Obgeais.CANDIDAT, ((inscriptions_metier.Equipe) (equipe)).getId(), nom);
    }
    frame.dispose();
    new inscriptions_gui.Modifier.FrameModifierEquipeIG(equipe);
}