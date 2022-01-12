@java.lang.Override
protected void fx(int cell, com.watabou.utils.Callback callback) {
    wandUser.getSprite().setVisible(false);
    com.watabou.pixeldungeon.effects.MagicMissile.whiteLight(wandUser.getSprite().getParent(), wandUser.getPos(), cell, callback);
    Sample.INSTANCE.play(Assets.SND_ZAP);
}