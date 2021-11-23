@org.junit.Test
public void testIsTableNewWhenTableNotNew() throws java.lang.Exception {
    final inputer.Scanner scanner = new inputer.Scanner();
    final engine.models.Table table = new engine.models.Table("005D0A28", 10, 6, null);
    Game.tables.add(table);
    final java.lang.String tempString = "Game #142837817463 005D0A28";
    final boolean actualResult = scanner.isTableNew(tempString);
    assertFalse(actualResult);
}