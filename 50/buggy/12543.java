private void update(float delta) {
    stage.act(delta);
    checkScreenSwitch();
    playSoundOnTime();
}