public void playSound(onion.szxb74om7zsmd2jm.limitlesslabyrinth.mechanics.MusicDirector.SoundName sn) {
    setSoundNowPlaying(sn);
    switch (currentSound) {
        case PLAYERHIT :
            soundPlaying = onion.szxb74om7zsmd2jm.limitlesslabyrinth.mechanics.MusicDirector.playerhit;
    }
    soundPlaying.play();
}