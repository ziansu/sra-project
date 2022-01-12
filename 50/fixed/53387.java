public void updateStateEvent() {
    if ((state) == (com.mygdx.Dominion.Network.Controller.DominionServerController.ACTIONCARDPHASE)) {
        state = com.mygdx.Dominion.Network.Controller.DominionServerController.TREASURECARDPHASE;
        return ;
    }
}