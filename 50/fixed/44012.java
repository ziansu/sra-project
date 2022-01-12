@java.lang.Override
public void onGameStarted(main.network.server.game.UpdateStats update) {
    colore = getClient().getPlayersColors().get(nomeGiocatore).getSwingName();
    aggiornamento(update);
}