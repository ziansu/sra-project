@org.junit.Test
public void testEnableCastle() {
    rookBlack.disableCastle();
    assertFalse(rookBlack.getCastleStatus());
    rookBlack.enableCastle();
    assertTrue(rookBlack.getCastleStatus());
}