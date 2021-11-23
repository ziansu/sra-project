public void keyReleased(int key, char c) {
    switch (key) {
        case org.newdawn.slick.Input.KEY_1 :
            tMain.newGame();
            tMain.enterState(1, new org.newdawn.slick.state.transition.FadeOutTransition(org.newdawn.slick.Color.black), new org.newdawn.slick.state.transition.FadeInTransition(org.newdawn.slick.Color.black));
            break;
        case org.newdawn.slick.Input.KEY_2 :
            break;
        case org.newdawn.slick.Input.KEY_3 :
            break;
        case org.newdawn.slick.Input.KEY_SPACE :
            tMain.enterState(5);
            break;
        default :
            break;
    }
}