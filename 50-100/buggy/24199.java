private int popupExit() {
    int choix;
    choix = org.analyse.core.util.GUIUtilities.question_YES_NO(org.analyse.core.util.Utilities.getLangueMessage(Constantes.MESSAGE_FERMER_LOGICIEL));
    if (choix == (javax.swing.JOptionPane.NO_OPTION))
        choix = javax.swing.JOptionPane.CANCEL_OPTION;
    
    if (choix == (javax.swing.JOptionPane.YES_OPTION)) {
        if ((this.fileName) != null) {
            choix = org.analyse.core.util.GUIUtilities.question_YES_NO_CANCEL(org.analyse.core.util.Utilities.getLangueMessage(Constantes.MESSAGE_SAUVEGARDER_FICHIER_ENCOURS));
            if (choix == (javax.swing.JOptionPane.YES_OPTION))
                save();
            
        }
    }
    return choix;
}