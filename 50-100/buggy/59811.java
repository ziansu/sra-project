public int compare(net.bubbaland.megaciv.game.Civilization civ1, net.bubbaland.megaciv.game.Civilization civ2) {
    boolean civ1Military = civ1.hasTech(Technology.MILITARY);
    boolean civ2Military = civ2.hasTech(Technology.MILITARY);
    if (civ1Military ^ civ2Military) {
        return civ1Military ? -1 : 1;
    }else {
        return new net.bubbaland.megaciv.game.Civilization.CensusComparator().compare(civ1, civ2);
    }
}