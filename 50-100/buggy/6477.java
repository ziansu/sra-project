public void placeSettlement(shared.locations.VertexLocation vertLoc) {
    switch (status) {
        case "FirstRound" :
            clientFacade.buildSettlement(vertLoc, true);
            clientFacade.finishTurn();
            break;
        case "SecondRound" :
            clientFacade.buildSettlement(vertLoc, true);
            clientFacade.finishTurn();
            break;
        default :
            clientFacade.buildSettlement(vertLoc, false);
            break;
    }
    getView().placeSettlement(vertLoc, clientFacade.getPlayerColor());
}