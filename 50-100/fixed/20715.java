@java.lang.Override
public void activate() throws org.newdawn.slick.SlickException {
    if (locked)
        return ;
    
    io.github.endreman0.achievementhunter.configuration.Configuration.win(level);
    if ((level.number()) < (io.github.endreman0.achievementhunter.game.LevelState.LEVELS.size())) {
        io.github.endreman0.achievementhunter.AchievementHunter.instance().enterState(io.github.endreman0.achievementhunter.game.LevelState.LEVELS.get(level.number()));
    }else {
        io.github.endreman0.achievementhunter.AchievementHunter.instance().enterState(TitleState.INSTANCE);
    }
}