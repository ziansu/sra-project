@java.lang.Override
public void restoreFromBundle(com.watabou.utils.Bundle bundle) {
    super.restoreFromBundle(bundle);
    glyph = ((com.shatteredpixel.shatteredpixeldungeon.items.armor.Armor.Glyph) (bundle.get(com.shatteredpixel.shatteredpixeldungeon.items.armor.Armor.GLYPH)));
    if ((hitsToKnow = bundle.getInt(com.shatteredpixel.shatteredpixeldungeon.items.armor.Armor.UNFAMILIRIARITY)) == 0) {
        hitsToKnow = com.shatteredpixel.shatteredpixeldungeon.items.armor.Armor.HITS_TO_KNOW;
    }
    inscribe(((com.shatteredpixel.shatteredpixeldungeon.items.armor.Armor.Glyph) (bundle.get(com.shatteredpixel.shatteredpixeldungeon.items.armor.Armor.GLYPH))));
}