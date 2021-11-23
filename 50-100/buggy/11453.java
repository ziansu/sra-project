@org.junit.Test
public void testPerformPlacePitfall() {
    nl.tudelft.contextproject.util.webinterface.ActionUtil.perform(Action.PLACEPITFALL, 0, 0);
    org.mockito.Mockito.verify(nl.tudelft.contextproject.Main.getInstance(), org.mockito.Mockito.times(1)).getCurrentGame();
    org.mockito.Mockito.verify(mockedGame, org.mockito.Mockito.times(1)).addEntity(org.mockito.Matchers.any(nl.tudelft.contextproject.model.entities.Pitfall.class));
}