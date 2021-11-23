@java.lang.Override
protected void onClick() {
    if ((enabled) && ((com.shatteredpixel.shatteredpixeldungeon.ui.AttackIndicator.lastTarget) != null)) {
        Dungeon.hero.handle(com.shatteredpixel.shatteredpixeldungeon.ui.AttackIndicator.lastTarget.pos);
    }
}