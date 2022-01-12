@java.lang.Override
protected void applyUpgrade() {
    if ((main.Scoreboard.XP()) >= (upgradeCost())) {
        main.Scoreboard.modXP((-(upgradeCost())));
        items.Gun g = ((items.Gun) (gui.Controller.getPlayer().getWeapons().get(1)));
        gui.Controller.getPlayer().replaceWeapon(1, new items.Gun(g.fireRate(), g.spareAmmo(), g.MAX_AMMO, g.RELOAD_FACTOR, false));
    }
}