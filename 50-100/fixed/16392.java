public final void init(double defaultValue, double minValue, double maxValue, boolean permanent, org.bukkit.scoreboard.Objective objective, java.lang.String bossBar, java.lang.String barColor, java.lang.String barStyle, boolean expBar) {
    this.defaultValue = defaultValue;
    this.minValue = minValue;
    this.maxValue = maxValue;
    this.permanent = permanent;
    this.objective = objective;
    this.bossBar = bossBar;
    this.barColor = barColor;
    this.barStyle = barStyle;
    this.expBar = expBar;
    init();
}