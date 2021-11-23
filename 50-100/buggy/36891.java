@java.lang.Override
public com.shatteredpixel.shatteredpixeldungeon.items.Item upgrade(boolean enchant) {
    super.upgrade(enchant);
    STR = 10;
    if ((wand) != null) {
        int curCharges = wand.curCharges;
        wand.upgrade();
        wand.maxCharges = java.lang.Math.min(((wand.maxCharges) + 1), 10);
        wand.curCharges = curCharges + 1;
        updateQuickslot();
    }
    return this;
}