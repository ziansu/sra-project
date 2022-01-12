public void onCreate(android.os.Bundle bundle) {
    super.onCreate(bundle);
    setContentView(R.layout.after_the_game);
    android.content.Intent intentFromGameActivity = getIntent();
    level = ((com.teamzenith.game.zpuzzle.model.Level) (intentFromGameActivity.getSerializableExtra("Level")));
    createComponents();
    actions();
}