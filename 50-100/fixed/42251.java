private static controllers.SubmitedChampsItemSet loadSubmitedItemSets(java.lang.String champName) {
    controllers.SubmitedChampsItemSet itemSets = play.cache.Cache.get((champName + "itemSets"), controllers.SubmitedChampsItemSet.class);
    if (itemSets == null) {
        session.put("selectedChampion", champName);
        itemSets = builds.getByChampion(champName);
        play.cache.Cache.set((champName + "itemSets"), itemSets);
    }
    return itemSets;
}