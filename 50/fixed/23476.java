@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_game_view);
    if ((gameUpdater) == null) {
        gameUpdater = new com.group7.farmtycoon.GameUpdater(this);
        gameUpdater.start();
    }
}