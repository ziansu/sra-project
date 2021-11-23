public void newGame(android.view.View view) {
    setContentView(R.layout.activity_choose_screen);
    seng301.monstertrainer.Monster.setHp(10);
    seng301.monstertrainer.Monster.setMaxHP(10);
    seng301.monstertrainer.Monster.setStamina(15);
    seng301.monstertrainer.Monster.setMaxStamina(15);
    seng301.monstertrainer.Monster.setHunger(0);
    seng301.monstertrainer.Monster.setLoyalty(0);
    seng301.monstertrainer.Monster.setLevel(1);
    seng301.monstertrainer.Monster.setExp(0);
    seng301.monstertrainer.Monster.setMaxExp(100);
}