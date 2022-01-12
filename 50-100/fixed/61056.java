@java.lang.Override
public void handle(javafx.scene.input.MouseEvent t) {
    if (((!(c.isMatched())) & (!(c.isTurned()))) & (!(c.inAnimation()))) {
        game.GameEventhandler.cardturn(c, this);
    }
}