private static void store(final com.watabou.utils.Bundle bundle, final java.util.HashSet<com.watabou.pixeldungeon.Badges.Badge> badges) {
    int count = 0;
    java.lang.String[] names = new java.lang.String[badges.size()];
    for (com.watabou.pixeldungeon.Badges.Badge badge : badges) {
        names[(count++)] = badge.toString();
    }
    bundle.put(com.watabou.pixeldungeon.Badges.BADGES, names);
}