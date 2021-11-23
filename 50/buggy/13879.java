@org.junit.Test
public void testCollisionsLevelModifier() {
    nl.tudelft.scrumbledore.level.KineticsLevelModifier klm = new nl.tudelft.scrumbledore.level.KineticsLevelModifier();
    nl.tudelft.scrumbledore.game.ScoreCounter sc = new nl.tudelft.scrumbledore.game.ScoreCounter();
    nl.tudelft.scrumbledore.level.CollisionsLevelModifier clm = new nl.tudelft.scrumbledore.level.CollisionsLevelModifier(sc);
    org.junit.Assert.assertEquals(sc, clm.getScore());
}