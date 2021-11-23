public domain.Item generateItem2(int i) {
    this.updater = ms.getUpdater();
    domain.Item item = new domain.Item(i);
    generateUpgrades(item, ms);
    generateAchievments(item, updater, ac);
    logic.ItemGenerator.itemlist.add(item);
    return item;
}