@java.lang.Override
public void onCollide(com.bopthenazi.utils.Collidable partner) {
    super.onCollide(partner);
    gameScreen.getSoundManager().playSound(SoundManager.SOUND_ID_EXPLOSION);
    gameScreen.doExplosionSplash();
    gameScreen.doScreenShake();
}