public void testPerformOpenGate() {
    nl.tudelft.contextproject.model.entities.Gate gate = org.mockito.Mockito.mock(nl.tudelft.contextproject.model.entities.Gate.class);
    mockedGame.addEntity(gate);
    nl.tudelft.contextproject.util.webinterface.ActionUtil.perform(Action.OPENGATE, 0, 0);
    org.mockito.Mockito.verify(nl.tudelft.contextproject.Main.getInstance(), org.mockito.Mockito.times(1)).getCurrentGame();
    org.mockito.Mockito.verify(gate, org.mockito.Mockito.atLeastOnce()).openGate();
}