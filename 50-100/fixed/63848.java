@java.lang.Override
public void onEnable() {
    if ((iConomyversion()) == 0) {
        return ;
    }else {
        try {
            this.getConfig().options().copyDefaults(true);
            saveConfig();
            reloadConfig();
            java.lang.System.out.println("[xpShop] Config file found!");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        java.lang.System.out.println((("[xpShop]Version: " + (getDescription().getVersion())) + " successfully enabled!"));
    }
}