@org.junit.Before
public void setUp() {
    mockedGame = mock(nl.tudelft.contextproject.model.Game.class);
    when(nl.tudelft.contextproject.Main.getInstance().getCurrentGame()).thenReturn(mockedGame);
}