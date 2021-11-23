public void choixCouleurFusion(java.util.ArrayList<application.model.Chaine> listeChainePlateau, java.util.ArrayList<application.model.Chaine> listeChaineAModif, application.model.Chaine c, application.model.Case case1) throws java.rmi.RemoteException {
    java.util.ArrayList<application.model.Chaine> listeChaineDifferenteAvantModif = listeChaineAModif;
    application.model.Chaine chaineAbsorbanteAvantFusion = c;
    java.lang.System.out.println("avantFusion");
    getGame().getPlateau().fusionChaines(game.getListeChaine(), listeChaineAModif, c, case1);
    getGame().setAction(new application.model.Action(application.globale.Globals.choixActionFusionEchangeAchatVente, listeChaineDifferenteAvantModif, chaineAbsorbanteAvantFusion));
    nextTurnAction();
    distribution();
}