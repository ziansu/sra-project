public boolean changeMusicState() {
    musicON = !(musicON);
    if (musicON) {
        mute(true);
    }else {
        for (sound.Playable p : playables) {
            if (isMusicClip(p.getClipName())) {
                p.restartClip();
            }
        }
    }
    return musicON;
}