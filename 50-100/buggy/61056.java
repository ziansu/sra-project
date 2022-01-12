@java.lang.Override
public void handle(javafx.scene.input.MouseEvent t) {
    if (((!(c.isMatched())) && (!(c.isTurned()))) && (!(c.inAnimation()))) {
        javafx.animation.Transition animation = game.GameEventhandler.cardturn(c, this);
        animation.play();
        c.lock();
    }
}