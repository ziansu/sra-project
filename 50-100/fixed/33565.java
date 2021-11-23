@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_category_menu);
    com.app.game.quizee.backend.Player player = com.app.game.quizee.backend.PlayerManager.getInstance().getCurrentPlayer();
    player.clearSelectedCategories();
    player.addObserver(this);
    addPlayerToolBar(player);
    addStartButton(player);
    addCategoriesList();
}