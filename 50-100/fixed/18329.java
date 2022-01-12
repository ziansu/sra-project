public void call() {
    ch.pos = newPos;
    if ((ch.pos) == (trajectory.collisionPos)) {
        ch.damage(com.watabou.utils.Random.NormalIntRange(((finalDist + 1) / 2), finalDist), this);
        com.shatteredpixel.shatteredpixeldungeon.actors.buffs.Paralysis.prolong(ch, com.shatteredpixel.shatteredpixeldungeon.actors.buffs.Paralysis.class, com.watabou.utils.Random.NormalIntRange(((finalDist + 1) / 2), finalDist));
    }
    Dungeon.level.press(ch.pos, ch);
}