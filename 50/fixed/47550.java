public static int getXPFromLevel(int level) {
    int totalXP = 0;
    for (int i = 0; i < level; i++) {
        totalXP += am2.utility.EntityUtilities.xpBarCap(i);
    }
    return totalXP;
}