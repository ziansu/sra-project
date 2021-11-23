public main.Route selectRouteViaTournament() {
    int bestIndex = java.lang.Integer.MAX_VALUE;
    int bestValue = java.lang.Integer.MAX_VALUE;
    for (int i = 0; i < (main.GeneticAlgorithm.TOURNAMENT_SIZE); i++) {
        int index = main.Util.randomWithRange(0, ((routes.length) - 1));
        if ((routes[index].getTotalDistance()) < bestValue) {
            bestIndex = index;
        }
    }
    return routes[bestIndex];
}