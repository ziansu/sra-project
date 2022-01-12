public void applyZoom(float amount) {
    gameCamera.zoom *= amount;
    gameCamera.update();
    net.net63.codearcade.LSD.components.StateComponent state = stateMapper.get(player);
    if ((state.get()) == (net.net63.codearcade.LSD.components.PlayerComponent.STATE_AIMING)) {
        state.set(PlayerComponent.STATE_STILL);
    }
}