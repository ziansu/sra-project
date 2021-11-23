@java.lang.Override
public boolean attachTo(com.shatteredpixel.shatteredpixeldungeon.actors.Char target) {
    spend(((charge) - 1));
    ((com.shatteredpixel.shatteredpixeldungeon.actors.hero.Hero) (target)).spendAndNext(charge);
    com.shatteredpixel.shatteredpixeldungeon.actors.buffs.Hunger hunger = target.buff(com.shatteredpixel.shatteredpixeldungeon.actors.buffs.Hunger.class);
    if ((hunger != null) && (!(hunger.isStarving())))
        hunger.satisfy(charge);
    
    charge = 0;
    (target.invisible)++;
    updateQuickslot();
    com.shatteredpixel.shatteredpixeldungeon.Dungeon.observe();
    return super.attachTo(target);
}