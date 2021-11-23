public void init() {
    int w = host.getWidth();
    int h = host.getHeight();
    int spacingFromTopEdge = host.getTileSize();
    int spacingBetween = w / 6;
    teams.get(0).init(spacingFromTopEdge, spacingBetween, new resources.Direction(270));
    teams.get(1).init((h - (spacingFromTopEdge * 2)), spacingBetween, new resources.Direction(90));
    initializers.Master.setCurrentBattle(this);
    end = false;
}