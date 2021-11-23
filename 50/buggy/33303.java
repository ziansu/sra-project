public void CreateNewTable(int playerCount) {
    game.Table table = new game.Table(tables.size(), playerCount);
    table.start();
    tables.add(table);
}