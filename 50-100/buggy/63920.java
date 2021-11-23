private static int calculateIncrease(int players, int startMaxHealth, float percentStart, float percentDec) {
    int out = startMaxHealth;
    for (int i = 0; i < (java.lang.Math.min(players, entity.mobs.MobHealthScaling.maxPlayers)); i++) {
        out += startMaxHealth * (java.lang.Math.max(1, (percentStart - (percentDec * players))));
    }
    return out - startMaxHealth;
}