@java.lang.Override
public void dispose() {
    if (com.github.bot.curiosone.app.games.wordtiles.Settings.Settings.MUSIC)
        music.dispose();
    
    if (com.github.bot.curiosone.app.games.wordtiles.Settings.Settings.SFX)
        clickSound.dispose();
    
    background.dispose();
    super.dispose();
}