public void gameResume() {
    if (!(isLocked)) {
        this.resume();
    }
    shot = 1;
    nitrogene.core.CursorSystem.changeCursor("greenfire");
    isPauseLocked = false;
}