@org.junit.Test
public void testIgnoresNonCreatures() {
    addCard(Zone.BATTLEFIELD, playerA, "Gratuitous Violence");
    addCard(Zone.BATTLEFIELD, playerA, "Honden of Infinite Rage");
    addTarget(playerA, playerB);
    setStopAt(1, PhaseStep.PRECOMBAT_MAIN);
    execute();
    assertLife(playerB, 19);
}