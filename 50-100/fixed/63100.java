@org.junit.Test
public void testisLefty() {
    int movespeed = 2;
    boolean isLefty = true;
    nl.tudelft.fishy.Sprite sprite = org.mockito.Mockito.mock(nl.tudelft.fishy.Sprite.class);
    nl.tudelft.fishy.EnemyFish enemyFish = new nl.tudelft.fishy.EnemyFish(movespeed, isLefty, sprite);
    org.junit.Assert.assertTrue(enemyFish.isLefty());
}