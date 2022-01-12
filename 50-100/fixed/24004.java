public void restart() {
    levels.reset();
    guy.reset();
    music.reset();
    sfx.reset();
    HeroAdventure.death.reset();
    tracker.start();
    music.playBG();
    splatter.stop();
    HeroAdventure.finish = false;
}