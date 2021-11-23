public void keyReleased(int key, char c) {
    switch (key) {
        default :
            break;
        case org.newdawn.slick.Input.KEY_ENTER :
            highScoreManager.addScores(tTextField.getText(), tMain.getGame().getScore());
            tMain.enterState(6, new org.newdawn.slick.state.transition.FadeInTransition(org.newdawn.slick.Color.black), new org.newdawn.slick.state.transition.FadeOutTransition(org.newdawn.slick.Color.black));
    }
}