public void draw(com.badlogic.gdx.graphics.g2d.SpriteBatch batch) {
    for (bachelor.project.nije214.thhym14.Enemy enemy : wp.getEnemyArray()) {
        enemy.getSprite().draw(batch);
    }
    for (bachelor.project.nije214.thhym14.Tower t : towers) {
        t.getSprite().draw(batch);
    }
    for (bachelor.project.nije214.thhym14.Bullet b : bullet.getBulletArray()) {
        b.getSprite().draw(batch);
    }
}