public void play() {
    boolean found = illarion.client.Login.getInstance().selectCharacter(listBox.getFocusItemIndex());
    if (!found) {
        statusLabel.setText("No character selected");
        statusLabel.getElement().getParent().layoutElements();
        return ;
    }
    game.enterState(Game.STATE_LOADING, new org.newdawn.slick.state.transition.FadeOutTransition(), new org.newdawn.slick.state.transition.FadeInTransition());
}