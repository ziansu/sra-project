public void update(float dt) {
    if (com.afonsobordado.CommanderGDX.states.IPmenu.play) {
        gsm.pushState(GameStateManager.PLAY);
    }
}