@org.junit.Test
public void CombatantArmorClassDeterminesHit() {
    test.battle.AutoCombatant attacker1 = new test.battle.AutoCombatant.CombatantBuilder().withSpecificHit(10).build();
    test.battle.AutoCombatant attacker2 = new test.battle.AutoCombatant.CombatantBuilder().withSpecificHit(11).build();
    test.battle.AutoCombatant victim = new test.battle.AutoCombatant.CombatantBuilder().withAC(11).withHP(1).build();
    attacker1.attack(victim);
    org.junit.Assert.assertFalse(victim.isUnconscious());
    attacker2.attack(victim);
    org.junit.Assert.assertTrue(victim.isUnconscious());
}