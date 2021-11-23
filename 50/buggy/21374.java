@java.lang.Override
public int getValue() {
    try {
        @java.lang.SuppressWarnings(value = { "rawtypes" , "unused" })
        java.lang.Class cls = java.lang.Class.forName("com.sk89q.worldguard");
        return one.lindegaard.MobHunting.compatability.WorldGuardCompat.isSupported() ? 1 : 0;
    } catch (java.lang.ClassNotFoundException e) {
        return 0;
    }
}