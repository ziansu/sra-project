public boolean setBlueUpgrade() {
    if ((blueBalls) < 5) {
        return false;
    }
    blueBalls = (blueBalls) - 5;
    if ((blue) == null) {
        blue = new uk.org.ulcompsoc.ld32.components.upgrades.Damage_Plus();
        return true;
    }
    return true;
}