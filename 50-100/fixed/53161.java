@java.lang.Override
public void initialisePlayer(world.World world) {
    this.world = world;
    for (int i = 0; i < (world.numRow); i++) {
        for (int j = 0; j < (world.numColumn); j++) {
            player.Guess g = new player.Guess();
            g.row = i;
            g.column = j;
            unmadeGuesses.add(g);
        }
    }
}