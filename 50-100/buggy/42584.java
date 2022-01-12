public int rollDice() throws java.lang.Exception {
    if (canRollDice(client.clientFacade.ClientFacade.getInstance().getUserData().getPlayerIndex())) {
        try {
            shared.communication.proxy.RollNumber r = new shared.communication.proxy.RollNumber(client.clientFacade.ClientFacade.getInstance().getUserData().getPlayerIndex());
            proxy.rollNumber(r);
            return r.getRoll();
        } catch (java.lang.Exception e) {
            throw new java.lang.Exception("Error rolling dice");
        }
    }else {
        return -1;
    }
}