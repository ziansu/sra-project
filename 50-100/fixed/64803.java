@java.lang.Override
public void takeDamage(double dmg) {
    e.healthPoint -= dmg;
    e.hitted();
    e.setAnimation(Assets.anim_enemy01_hitted);
    Gdx.app.log(e.TAG, ("current hp = " + (e.healthPoint)));
    if ((e.healthPoint) <= 0) {
        e.healthPoint = 0;
        Gdx.app.log(e.TAG, "monster die");
        e.setAnimation(Assets.anim_enemy01_die);
        changeState();
    }
}