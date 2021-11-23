@org.junit.Before
public void setUp() {
    mockedGame = org.mockito.Mockito.mock(nl.tudelft.contextproject.model.Game.class);
    org.mockito.Mockito.when(nl.tudelft.contextproject.Main.getInstance().getCurrentGame()).thenReturn(mockedGame);
}