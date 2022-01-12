private static void store(com.watabou.utils.Bundle bundle, java.util.HashSet<com.shatteredpixel.shatteredpixeldungeon.Badges.Badge> badges) {
    int count = 0;
    java.lang.String[] names = new java.lang.String[com.shatteredpixel.shatteredpixeldungeon.Badges.global.size()];
    for (com.shatteredpixel.shatteredpixeldungeon.Badges.Badge badge : badges) {
        names[(count++)] = badge.toString();
    }
    bundle.put(com.shatteredpixel.shatteredpixeldungeon.Badges.BADGES, names);
}