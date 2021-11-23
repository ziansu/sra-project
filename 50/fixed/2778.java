public static void removeFromObjList(org.made.neohabitat.HabitatMod mod) {
    if ((mod.noid) < (UNASSIGNED_NOID)) {
        mod.current_region().noids[mod.noid] = null;
        mod.noid = UNASSIGNED_NOID;
    }
}