@java.lang.Override
public void onGameStarted(main.network.server.game.UpdateStats update) {
    colore = main.ui.gui.Frame.getClient().getPlayersColors().get(nomeGiocatore).getSwingName();
    aggiornamento(update);
}