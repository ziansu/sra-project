public int damageRoll(int lvl) {
    return com.watabou.utils.Random.NormalIntRange(min(lvl), ((max(lvl)) + (Dungeon.hero.wandPower())));
}