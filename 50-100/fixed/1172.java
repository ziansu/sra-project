@java.lang.Override
public com.shatteredpixel.shatteredpixeldungeon.items.Item random() {
    float roll = com.watabou.utils.Random.Float();
    if (roll < 0.3F) {
        inscribe(com.shatteredpixel.shatteredpixeldungeon.items.armor.Armor.Glyph.randomCurse());
        cursed = true;
        return this;
    }else
        if (roll < 0.75F) {
        }else
            if (roll < 0.95F) {
                upgrade(1);
            }else {
                upgrade(2);
            }
        
    
    if ((com.watabou.utils.Random.Int(6)) == 0)
        inscribe();
    
    return this;
}