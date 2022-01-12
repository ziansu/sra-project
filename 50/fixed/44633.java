@org.junit.Test
public void testIgnoresNonCreatures() {
    addCard(Zone.BATTLEFIELD, playerA, "Honden of Infinite Rage");
    addCard(Zone.BATTLEFIELD, playerA, "Gratuitous Violence");
    addTarget(playerA, playerB);
    setStopAt(1, PhaseStep.PRECOMBAT_MAIN);
    execute();
    assertLife(playerB, 19);
}