public int compare(net.bubbaland.megaciv.game.Civilization civ1, net.bubbaland.megaciv.game.Civilization civ2) {
    int result = java.lang.Integer.compare(civ1.getPopulation(), civ2.getPopulation());
    if (result == 0) {
        result = civ1.compareTo(civ2);
    }
    return result;
}