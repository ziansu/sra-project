void initializeGame() {
    android.content.res.Resources res = getResources();
    com.game.simpled3.engine.Game.initialize(res, this);
    com.game.simpled3.engine.Player.initialize(res);
    com.game.simpled3.engine.gear.ItemFactory.initialize(res);
    gearPage = new com.game.simpled3.UI.EquipmentPage();
    android.content.Context context = getApplicationContext();
    itemView = new com.game.simpled3.UI.ItemViewPage(context);
    deathPage = new com.game.simpled3.UI.DeathPage();
    rewardPage = new com.game.simpled3.UI.RewardPage();
    playerStatPage = ((com.game.simpled3.UI.PlayerStatPage) (getFragmentManager().findFragmentById(R.id.playerStatPage)));
    playerStatPage.updateUI();
}