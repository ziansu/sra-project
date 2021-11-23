@org.junit.Test
public void testIsDistributionNewWhenFalse() throws java.lang.Exception {
    final inputer.Translator translator = new inputer.Translator();
    final java.lang.String number = "Game #143284520901 00400A2A";
    final engine.models.Table table = new engine.models.Table("00400A2A", 1, 1);
    Game.tables.add(table);
    final boolean actualAnswer = translator.isDistributionNew(number);
    assertFalse(actualAnswer);
}