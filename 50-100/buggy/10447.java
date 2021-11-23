@java.lang.Override
public float estimate(us.thirdmillenium.desktoptrainer.ai.TileNode node, us.thirdmillenium.desktoptrainer.ai.TileNode endNode) {
    com.badlogic.gdx.math.Vector2 start = new com.badlogic.gdx.math.Vector2(node.getCellX(), node.getCellY());
    com.badlogic.gdx.math.Vector2 end = new com.badlogic.gdx.math.Vector2(endNode.getCellX(), node.getCellY());
    return start.dst(end);
}