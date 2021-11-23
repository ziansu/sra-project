public static void init() {
    com.shatteredpixel.shatteredpixeldungeon.actors.Actor.addDelayed(Dungeon.hero, (-(java.lang.Float.MIN_VALUE)));
    for (com.shatteredpixel.shatteredpixeldungeon.actors.mobs.Mob mob : Dungeon.level.mobs) {
        com.shatteredpixel.shatteredpixeldungeon.actors.Actor.add(mob);
    }
    for (com.shatteredpixel.shatteredpixeldungeon.actors.blobs.Blob blob : Dungeon.level.blobs.values()) {
        com.shatteredpixel.shatteredpixeldungeon.actors.Actor.add(blob);
    }
    com.shatteredpixel.shatteredpixeldungeon.actors.Actor.current = null;
}