public void changed(no.ntnu.game.views.ChangeEvent event, com.badlogic.gdx.scenes.scene2d.Actor actor) {
    java.lang.String newFen = ((fen1Field.getText()) + "/") + (fen2Field.getText());
    controller.updateUserBoard(newFen);
}