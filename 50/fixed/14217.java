@org.junit.Test
public void testPerformSpawnEnemy() {
    nl.tudelft.contextproject.util.webinterface.ActionUtil.perform(Action.SPAWNENEMY, 0, 0);
    verify(mockedGame, times(1)).addEntity(any(nl.tudelft.contextproject.model.entities.KillerBunny.class));
}