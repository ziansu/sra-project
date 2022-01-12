@org.junit.Test
public void testIsTableNewWhenTableNew() throws java.lang.Exception {
    final inputer.Scanner scanner = new inputer.Scanner();
    final engine.models.Table table = new engine.models.Table("321DF898", 10, 6, null);
    Game.tables.add(table);
    final java.lang.String tempString = "Game #142837817463 005D0A29";
    final boolean actualAnswer = scanner.isTableNew(tempString);
    assertTrue(actualAnswer);
}