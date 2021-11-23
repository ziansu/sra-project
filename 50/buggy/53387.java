public void updateStateEvent() {
    if ((state) == (com.mygdx.Dominion.Network.Controller.DominionServerController.ACTIONCARDPHASE)) {
        state = com.mygdx.Dominion.Network.Controller.DominionServerController.TREASURECARDPHASE;
        return ;
    }
    if ((state) == (com.mygdx.Dominion.Network.Controller.DominionServerController.TREASURECARDPHASE)) {
        state = com.mygdx.Dominion.Network.Controller.DominionServerController.ENDPHASE;
        return ;
    }
}