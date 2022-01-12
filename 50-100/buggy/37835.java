@org.junit.Test
public void explosiveTest() {
    edu.chalmers.vaporwave.model.game.GameCharacter gameCharacter = new edu.chalmers.vaporwave.model.game.GameCharacter("ALYSSA", 0);
    edu.chalmers.vaporwave.model.game.Explosive bomb = new edu.chalmers.vaporwave.model.game.Bomb(gameCharacter, 10, 0, 10, 30);
    assertTrue(gameCharacter.getGridPosition().equals(bomb.getPosition()));
}