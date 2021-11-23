void loadAssignment(java.lang.String dungeon, project_rpg.Course course) {
    if (_game.getPlayer().noSkillsSet()) {
        updateMenuBar("You cannot enter a dungeon without setting your battle skills!");
        return ;
    }
    removeAll();
    hideMenu();
    displayMenuBar();
    project_rpg.BattleGrid battle = new project_rpg.BattleGrid(this, _game.getPlayer(), dungeon, course);
    add(battle);
    battle.start();
    audioHandler.playSong("intensity_teaser");
    battle.requestFocusInWindow();
}