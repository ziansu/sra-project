public domain.Item generateItem2(int i) {
    this.updater = ms.getUpdater();
    domain.Item item = new domain.Item(i);
    logic.ItemGenerator.itemlist.add(item);
    generateUpgrades(item, ms);
    generateAchievments(item, updater, ac);
    return item;
}