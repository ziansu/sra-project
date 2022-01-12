public void setChars(ultrapoulet.wifeygame.battle.BattleWifey input, ultrapoulet.wifeygame.battle.BattleEnemy enemy) {
    displayChar = input;
    displayEnemy = enemy;
    displayText = -1;
    skillsPage = 0;
    maxPage = (displayChar.getSkills().size()) / (SKILLS_TEXT_PER_PAGE);
    multipliers = displayChar.getMultipliers(enemy);
}