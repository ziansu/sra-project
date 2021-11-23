@java.lang.Override
public void syncConfig(net.minecraftforge.common.config.Configuration config) {
    isEnabled = config.getBoolean("Exp Achievements", Const.ConfigCategory.player, true, "Get experience from achievements (random 20-30 exp, multiplied by 100 if it is flagged as special)");
}