public static com.dreamteam.villageTycoon.map.Resource[] fromStringArray(java.lang.String[] s) {
    com.dreamteam.villageTycoon.map.Resource[] r = new com.dreamteam.villageTycoon.map.Resource[s.length];
    for (int i = 0; i < (r.length); i++) {
        r[i] = new com.dreamteam.villageTycoon.map.Resource(s[i]);
    }
    return r;
}