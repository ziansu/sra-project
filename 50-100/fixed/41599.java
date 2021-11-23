public static com.dreamteam.villageTycoon.map.Resource[] fromStringArray(java.lang.String[] r) {
    com.dreamteam.villageTycoon.map.Resource[] out = new com.dreamteam.villageTycoon.map.Resource[r.length];
    for (int i = 0; i < (r.length); i++) {
        out[i] = com.dreamteam.villageTycoon.map.Resource.get(r[i]);
    }
    return out;
}