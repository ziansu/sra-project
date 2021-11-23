@java.lang.Override
public void update() {
    super.update();
    if ((timeLeft) > 0) {
        if ((timeLeft -= com.watabou.noosa.Game.elapsed) <= 0) {
            killAndErase();
        }else {
            float p = (timeLeft) / (com.watabou.pixeldungeon.effects.SystemFloatingText.LIFESPAN);
            alpha((p > 0.5F ? 1 : p * 2));
        }
    }
}