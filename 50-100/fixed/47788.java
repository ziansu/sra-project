public void testPerformOpenGate() {
    nl.tudelft.contextproject.model.entities.Gate gate = mock(nl.tudelft.contextproject.model.entities.Gate.class);
    mockedGame.addEntity(gate);
    nl.tudelft.contextproject.util.webinterface.ActionUtil.perform(Action.OPENGATE, 0, 0);
    verify(nl.tudelft.contextproject.Main.getInstance(), times(1)).getCurrentGame();
    verify(gate, atLeastOnce()).openGate();
}