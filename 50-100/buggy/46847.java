public void playMusic(float dist) {
    if (dist < 30) {
        audio_progman.setVolume((1.4F * (1 - (dist / 30))));
        audio_progman.play();
        if (dist < 15) {
            STATE = model.Progman.ProgmanState.catching;
            audio_progman2.setVolume((0.1F * (1 - (dist / 15))));
            audio_progman2.play();
        }else {
            audio_progman2.stop();
        }
    }else {
        audio_progman.stop();
    }
}