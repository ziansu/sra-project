public int reserve(java.lang.String name, int persons) throws restaurantChain.InvalidName {
    if (prenotations.containsKey(name))
        throw new restaurantChain.InvalidName();
    
    int requiredTables = ((int) (java.lang.Math.ceil((persons / 4))));
    if ((((tables) - (busyTables)) - requiredTables) < 0) {
        (refused)++;
        return 0;
    }
    busyTables += requiredTables;
    prenotations.put(name, persons);
    return requiredTables;
}