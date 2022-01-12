public void choiceFusionAction(java.util.HashMap<java.lang.String, java.lang.Integer> actions_fusions, application.model.Chaine chaineAbsorbee, application.model.Chaine chaineAbsorbante, java.lang.String pseudo) throws java.rmi.RemoteException {
    java.lang.System.out.println("ok");
    getGame().getTableauDeBord().traiteAction(actions_fusions, chaineAbsorbee, chaineAbsorbante, pseudo);
    if ((getGame().getOrdre_joueur_action().size()) == 0)
        getGame().getAction().getListeChainesAbsorbees().remove(0);
    
    nextTurnAction();
    distribution();
}