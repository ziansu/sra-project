@org.junit.Before
public void setUp() {
    this.island = new nz.ac.aut.ense701.gameModel.Island(20, 20);
    this.player = new nz.ac.aut.ense701.gameModel.Player(new nz.ac.aut.ense701.gameModel.Position(island, 3, 3), "James", 100.0, 100.0, 100.0, 100.0);
    this.foodItem = new nz.ac.aut.ense701.gameModel.Food(new nz.ac.aut.ense701.gameModel.Position(island, 3, 3), "Sandwich", "Sandwich", 20, 20, 20);
    this.msg = new nz.ac.aut.ense701.gameModel.GameMessage(player);
}