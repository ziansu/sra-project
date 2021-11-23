void loadDungeon(java.lang.String dungeon) {
    if (_game.getPlayer().noSkillsSet()) {
        updateMenuBar("You cannot enter a dungeon without setting your battle skills!");
        return ;
    }
    removeAll();
    hideMenu();
    displayMenuBar();
    audioHandler.playSong("intensity_teaser");
    project_rpg.BattleGrid battle = new project_rpg.BattleGrid(this, _game.getPlayer(), dungeon);
    add(battle);
    battle.requestFocusInWindow();
}