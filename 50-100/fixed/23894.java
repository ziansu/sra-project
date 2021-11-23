public void run() {
    if (battle.heroPriority()) {
        battle.enemyTurn();
        CurrHPStat.setText(java.lang.String.valueOf(battle.battleHero.getHP()));
    }else {
        battle.heroTurn();
        CurrMonHP.setText(java.lang.String.valueOf(battle.battleEnemy.getHP()));
    }
}