public void update(float dt) {
    if (com.afonsobordado.CommanderGDX.states.IPmenu.play) {
        com.afonsobordado.CommanderGDX.states.IPmenu.play = false;
        gsm.pushState(GameStateManager.PLAY);
    }
}