public void loadingDone() {
    if (loadingDoneCalled) {
        return ;
    }
    loadingDoneCalled = true;
    illarion.client.Login.getInstance().login();
    game.enterState(illarion.client.Game.STATE_PLAYING, new org.newdawn.slick.state.transition.FadeOutTransition(), null);
}