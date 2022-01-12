private int findDuplicates(java.util.List<java.util.List<game.players.Position>> rows) {
    java.util.List<game.players.Position> oneDimList = new java.util.ArrayList<>();
    for (java.util.List<game.players.Position> row : rows) {
        if ((row.size()) == 2) {
            oneDimList.addAll(row);
        }
    }
    java.util.Set<game.players.Position> positions = new java.util.HashSet(oneDimList);
    int numberOfDuplicates = (oneDimList.size()) - (positions.size());
    return numberOfDuplicates;
}