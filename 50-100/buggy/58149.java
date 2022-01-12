@org.junit.Test
public void testSearchTableExisting() throws java.lang.Exception {
    final inputer.Translator translator = new inputer.Translator();
    final java.lang.String hexKey = "00400A2A";
    final engine.models.Table expectedAnswer = new engine.models.Table(hexKey, 1, 1);
    Game.tables.add(expectedAnswer);
    final engine.models.Table actualAnswer = translator.searchTable(hexKey);
    assertEquals(expectedAnswer, actualAnswer);
}