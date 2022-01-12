public void startGame(com.james.rocket.utils.PreferenceUtils.LevelIdentifier level, int rocket, int projectile, int background, int cloud) {
    android.content.Intent i = new android.content.Intent(this, com.james.rocket.activities.FlappyActivity.class);
    i.putExtra(FlappyActivity.EXTRA_LEVEL, level);
    i.putExtra(FlappyActivity.EXTRA_ROCKET, rocket);
    i.putExtra(FlappyActivity.EXTRA_PROJECTILE, projectile);
    i.putExtra(FlappyActivity.EXTRA_BACKGROUND, background);
    i.putExtra(FlappyActivity.EXTRA_CLOUD, cloud);
    startActivity(i);
}