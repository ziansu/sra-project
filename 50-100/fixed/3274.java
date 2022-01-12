private static net.minecraft.stats.Achievement createAchievement(java.lang.String name, int column, int row, net.minecraft.item.Item item, net.minecraft.stats.Achievement parent) {
    net.minecraft.stats.Achievement acheivement = new net.minecraft.stats.Achievement(("achievement." + name), name, column, row, item, parent);
    net.magicaltech.handler.MTAchievementHandler.achievementsMT.add(acheivement);
    return acheivement;
}