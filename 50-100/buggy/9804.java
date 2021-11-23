private io.github.mariandcrafter.devathlon2.runde1.game.GameMap getRandomFreeMap() {
    java.util.List<io.github.mariandcrafter.devathlon2.runde1.game.GameMap> maps = new java.util.ArrayList<io.github.mariandcrafter.devathlon2.runde1.game.GameMap>(io.github.mariandcrafter.devathlon2.runde1.Main.getConfiguration().getGameMaps());
    for (io.github.mariandcrafter.devathlon2.runde1.game.Match match : matches) {
        maps.remove(match.getGameMap());
    }
    return maps.get(this.random.nextInt(maps.size()));
}