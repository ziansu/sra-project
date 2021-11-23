@org.junit.Before
public void setUp() throws java.lang.Exception {
    final java.lang.String numberDistribution = "144453195279";
    final engine.models.Card[] playersCards = new engine.models.Card[]{ new engine.models.Card(10, engine.models.Enums.Suits.Hertz) , new engine.models.Card(7, engine.models.Enums.Suits.Spades) };
    final engine.models.Distribution distribution = new engine.models.Distribution(playersCards, numberDistribution);
    final java.lang.String hexKey = "0006098E";
    final engine.models.Table table = new engine.models.Table(hexKey, 6, 1000, null);
    table.setCurrentDistribution(distribution);
    Game.tables.add(table);
}