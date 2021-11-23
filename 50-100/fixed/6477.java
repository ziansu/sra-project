public void placeSettlement(shared.locations.VertexLocation vertLoc) {
    switch (status) {
        case "FirstRound" :
            clientFacade.buildSettlement(vertLoc, true);
            break;
        case "SecondRound" :
            clientFacade.buildSettlement(vertLoc, true);
            break;
        default :
            clientFacade.buildSettlement(vertLoc, false);
            break;
    }
    getView().placeSettlement(vertLoc, clientFacade.getPlayerColor());
}