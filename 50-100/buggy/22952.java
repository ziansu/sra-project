public static int getTimeRemaining(org.bukkit.entity.Player player) {
    java.lang.String name = player.getName();
    long time = (java.lang.System.currentTimeMillis()) - (me.becja10.TogglePvP.Utils.Toggle.toggled.get(name));
    return (me.becja10.TogglePvP.Main.getInstance().getConfig().getInt("Toggle Delay")) - (((int) (time)) / 1000);
}