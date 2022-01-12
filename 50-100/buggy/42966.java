void hitEnemy(int damage) {
    android.widget.ProgressBar healthBar = ((android.widget.ProgressBar) (findViewById(R.id.health_bar)));
    com.example.evanroda.endless.model.Enemy enemy = enemies.get(enemyCurrent);
    enemy.mHealth -= damage;
    healthBar.setProgress(enemy.mHealth);
    if ((enemy.mHealth) <= 0) {
        enemyDeath();
    }
}