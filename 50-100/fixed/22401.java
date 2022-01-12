@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    card.setAttack(((card.getAttack()) + 1));
    board.setChoosing(0);
    for (me.daniel.cards.Card card : cards) {
        card.setToChoose(false);
        card.removeListener(card.getListeners().get(((card.getListeners().size) - 1)));
    }
}