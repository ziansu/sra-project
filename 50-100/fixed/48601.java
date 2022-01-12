private void levelCameraOnPlayerPosition() {
    int calculatedY = ((int) (this.getY()));
    if ((calculatedY - ((sk.tuke.gamedev.iddqd.tukequest.TukeQuestGame.SCREEN_HEIGHT) / 2)) <= 0) {
        calculatedY = (sk.tuke.gamedev.iddqd.tukequest.TukeQuestGame.SCREEN_HEIGHT) / 2;
    }
    camera.position.y = calculatedY;
    camera.position.x = (sk.tuke.gamedev.iddqd.tukequest.TukeQuestGame.SCREEN_WIDTH) / 2;
    camera.update();
}