public void init(com.projectdgdx.game.ProjectD projectD) {
    rand = new java.util.Random();
    this.multiplexer = projectD.getMultiplexer();
    com.projectdgdx.game.utils.MapParser parser = new com.projectdgdx.game.utils.MapParser();
    map = parser.parse("BasicMapTest");
    renderer = new com.projectdgdx.game.view.RenderManager();
    renderer.init(map);
}