public void CreateNewTable(int playerCount) {
    game.Table table = new game.Table(tables.size(), playerCount);
    tables.add(table);
    table.start();
}