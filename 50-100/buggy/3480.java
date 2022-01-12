public com.shatteredpixel.shatteredpixeldungeon.plants.Plant couch(int pos) {
    try {
        if (com.shatteredpixel.shatteredpixeldungeon.Dungeon.visible[pos]) {
            Sample.INSTANCE.play(Assets.SND_PLANT);
        }
        com.shatteredpixel.shatteredpixeldungeon.plants.Plant plant = plantClass.newInstance();
        plant.pos = pos;
        return plant;
    } catch (java.lang.Exception e) {
        com.shatteredpixel.shatteredpixeldungeon.ShatteredPixelDungeon.reportException(e);
        return null;
    }
}