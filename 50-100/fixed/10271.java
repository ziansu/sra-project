@java.lang.Override
public int getTotalProtection() {
    int totalProtection = getProtection();
    if (((getAnchorPoints().get("body")) != null) && ((getAnchorPoints().get("body").getClass()) == (game.Armor.class))) {
        game.Armor armor = ((game.Armor) (getAnchorPoints().get("body")));
        totalProtection += armor.getActualProtection();
    }
    return totalProtection;
}