@java.lang.Override
public void onSecond(long seconds) {
    pl.themolka.arcade.time.Time now = pl.themolka.arcade.time.Time.now();
    this.lastLostTicks = (now.minus(this.lastTime).toMillis()) - 1.0F;
    this.lastTime = now;
}