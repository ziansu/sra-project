public void playSound(onion.szxb74om7zsmd2jm.limitlesslabyrinth.mechanics.MusicDirector.SoundName sn) {
    this.setSoundNowPlaying(sn);
    switch (currentSound) {
        case PLAYERHIT :
            soundPlaying = onion.szxb74om7zsmd2jm.limitlesslabyrinth.mechanics.MusicDirector.playerhit;
    }
    soundPlaying.play();
}