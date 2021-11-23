@java.lang.Override
public void simpleInitApp() {
    setPauseOnLostFocus(false);
    this.gamePlayers = new java.util.LinkedList<messages.Player>();
    this.gamePlayerCharacters = new java.util.ArrayList();
    this.player = null;
    this.pac = null;
    createSkybg();
    initLightandShadow();
    initMaterial();
    initKeys();
    initGui();
    initNifty();
    mazeCreated = false;
    clientMaze = new client.Maze(40, 30, false);
    connect();
}