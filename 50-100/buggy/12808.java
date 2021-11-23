@org.junit.Before
public void setUp() throws java.lang.Exception {
    components = new haw.vs.superteam.gamesservice.Components();
    boardsAdapter = mock(haw.vs.superteam.gamesservice.api.BoardsAdapter.class);
    when(boardsAdapter.createBoard(org.mockito.Matchers.any(haw.vs.superteam.gamesservice.Game.class))).thenReturn(new haw.vs.superteam.gamesservice.Board());
    when(boardsAdapter.addPlayer(org.mockito.Matchers.any(haw.vs.superteam.gamesservice.Game.class), org.mockito.Matchers.any(haw.vs.superteam.gamesservice.Player.class))).thenReturn(true);
    playerAdapter = mock(haw.vs.superteam.gamesservice.api.PlayerAdapter.class);
    controller = new haw.vs.superteam.gamesservice.GameController("test-uri", playerAdapter, boardsAdapter);
}