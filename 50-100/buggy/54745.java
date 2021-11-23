public void copyHouse(House toCopy) {
    name = toCopy.name;
    realm = toCopy.realm;
    founded = toCopy.founded;
    foundingEvent = toCopy.foundingEvent;
    history = new History(toCopy.history);
    banners = new HouseList(toCopy.banners);
    age = toCopy.age;
    defense = toCopy.defense;
    influence = toCopy.influence;
    lands = toCopy.lands;
    law = toCopy.law;
    population = toCopy.population;
    power = toCopy.power;
    wealth = toCopy.wealth;
}