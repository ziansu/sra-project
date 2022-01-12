public void init(com.projectdgdx.game.ProjectD projectD) {
    this.multiplexer = projectD.getMultiplexer();
    com.projectdgdx.game.utils.MapParser parser = new com.projectdgdx.game.utils.MapParser();
    map = parser.parse("BasicMapTest");
    rand = new java.util.Random();
    renderer = new com.projectdgdx.game.view.RenderManager();
    renderer.init(map);
}