public static int getTimeRemaining(java.lang.String name) {
    long time = (java.lang.System.currentTimeMillis()) - (me.becja10.TogglePvP.Utils.Toggle.toggled.get(name));
    return (me.becja10.TogglePvP.Main.getInstance().getConfig().getInt("Toggle Delay")) - (((int) (time)) / 1000);
}