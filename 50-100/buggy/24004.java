public void restart() {
    levels.reset();
    guy.reset();
    sfx.stop();
    music.stopBG();
    music.stopVictory();
    music = new Music();
    sfx = new SFX();
    HeroAdventure.death.reset();
    tracker.start();
    music.playBG();
    splatter.stop();
    HeroAdventure.finish = false;
}