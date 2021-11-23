@java.lang.Override
public void onHandleMessage(olof.sjoholm.Net.Server.Player player, olof.sjoholm.Net.Both.Envelope envelope) {
    if (envelope instanceof olof.sjoholm.Net.Both.Envelope.PlayerSelectColor) {
        player.setColor(((olof.sjoholm.Net.Both.Envelope.PlayerSelectColor) (envelope)).getColor());
        gameBoard.updatePlayer(player);
    }
    if (envelope instanceof olof.sjoholm.Net.Both.Envelope.PlayerSelectName) {
        player.setName(((olof.sjoholm.Net.Both.Envelope.PlayerSelectName) (envelope)).name);
        gameBoard.updatePlayer(player);
    }
}