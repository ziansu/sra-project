@java.lang.Override
public com.example.michael.hrbunnies182.game.Edge addEdge(com.example.michael.hrbunnies182.game.Player player, android.graphics.Point city1, android.graphics.Point city2) {
    com.example.michael.hrbunnies182.game.Edge edge = gameMap.findEdge(city1, city2);
    java.lang.System.out.println(("Model: Got edge " + edge));
    if (edge != null) {
        java.lang.System.out.println(((("Model: Adding edge " + edge) + " to player ") + player));
        if (scoreMap.addOwner(edge, player)) {
            return edge;
        }
    }
    return null;
}