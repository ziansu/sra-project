public void run() {
    if (battle.heroPriority()) {
        battle.enemyTurn();
        CurrHPStat.setText(java.lang.String.valueOf(battle.battleHero.getHP()));
        android.util.Log.d(TAG, "we get here sometimes");
    }else {
        battle.heroTurn();
        CurrMonHP.setText(java.lang.String.valueOf(battle.battleEnemy.getHP()));
        android.util.Log.d(TAG, "we get here sometimes too");
    }
}