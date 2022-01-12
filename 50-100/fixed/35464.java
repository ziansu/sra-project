@org.junit.Before
public void setUp() {
    app = new com.funkydonkies.core.App();
    sManager = new com.jme3.app.state.AppStateManager(app);
    spawnState = new com.funkydonkies.gamestates.SpawnState();
    spy = org.mockito.Mockito.spy(spawnState);
    org.mockito.Mockito.doNothing().when(spy).spawn(org.mockito.Matchers.any(com.funkydonkies.interfaces.FactoryInterface.class), org.mockito.Matchers.any(com.jme3.scene.Node.class));
}