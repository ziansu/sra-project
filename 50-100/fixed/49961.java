@java.lang.Override
public void handle(long now) {
    if ((now - (then)) > (NANO_INTERVAL)) {
        if ((connected) && (net.hasMessage())) {
            game.recieveMessage(net.getMessage());
        }
        if ((connected) && (game.hasMessage())) {
            net.send(game.getMessage());
        }
        game.draw(radarPane, shipPane);
    }
    then = now;
}