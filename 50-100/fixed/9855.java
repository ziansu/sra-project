public void Proceed() {
    turnState = org.tilegames.hexicube.cah.client.neoteny.gameState.GameLogic.TurnState.ADDING_TO_PILE;
    org.tilegames.hexicube.cah.client.neoteny.gameLayers.CardsLayer.ClearPile();
    org.tilegames.hexicube.cah.client.neoteny.gameLayers.CardGame.SetNotification("");
    subCards.clear();
    for (org.tilegames.hexicube.cah.client.neoteny.gameState.DummyPlayer dum : dummies) {
        if ((czar.id) != (dum.me.id)) {
            dum.RequestCardSubmit();
        }
    }
}