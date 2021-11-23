@org.junit.Test
public void testPerformPlacePitfall() {
    nl.tudelft.contextproject.util.webinterface.ActionUtil.perform(Action.PLACEPITFALL, 0, 0);
    verify(nl.tudelft.contextproject.Main.getInstance(), times(1)).getCurrentGame();
    verify(mockedGame, times(1)).addEntity(any(nl.tudelft.contextproject.model.entities.Pitfall.class));
}