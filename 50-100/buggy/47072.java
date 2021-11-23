public int conditionMatch(int east, int west, int center, int north, int south) {
    for (int i = 0; i < (conditions.size()); i += 1) {
        com.inursoft.Automata.CMR.CellConditions condition = ((com.inursoft.Automata.CMR.CellConditions) (conditions.get(i)));
        if (isMatchCondition(condition, east, west, center, north, south)) {
            return condition.transValue;
        }
    }
    return 0;
}