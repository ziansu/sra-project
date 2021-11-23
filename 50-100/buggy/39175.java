@Before
public void before() {
    zoo = new Zoo();
    nutritionist = new Nutritionist("Charley", zoo);
    zooKeeper = new ZooKeeper("Kat", zoo);
    bambooForest = new BambooForest(7);
    arctic = new Arctic(5);
    zooKeeper.addEnclosure(bambooForest);
    burrito = new Burrito();
}