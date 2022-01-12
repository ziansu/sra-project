private static controllers.ChampionList loadChampionList() {
    controllers.ChampionList championList = play.cache.Cache.get("ChampionsCache", controllers.ChampionList.class);
    if ((championList == null) || ((championList.error.function) != "")) {
        if ((session.get("region")) != null)
            championList = new controllers.ChampionList(session.get("region").toLowerCase());
        else
            championList = new controllers.ChampionList("euw");
        
        play.cache.Cache.set("ChampionsCache", championList, (60 * 120));
    }
    return championList;
}