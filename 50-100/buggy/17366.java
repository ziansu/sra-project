@org.junit.Test
public void testMorbidAbilityWithAwakeningZoneTokens() {
    addCard(Zone.BATTLEFIELD, playerA, "Awakening Zone");
    addCard(Zone.BATTLEFIELD, playerA, "Leyline of the Void");
    addCard(Zone.BATTLEFIELD, playerB, "Deathreap Ritual");
    setChoice(playerA, "Yes");
    activateAbility(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Sacrifice");
    setChoice(playerB, "Yes");
    setStopAt(1, PhaseStep.END_TURN);
    execute();
    assertPermanentCount(playerA, "Eldrazi Spawn", 0);
    assertExileCount(playerB, 0);
    assertHandCount(playerB, 0);
}