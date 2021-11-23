private gka.GraphBuilder.Extension.OwnVertex getRandomVertex() {
    gka.GraphBuilder.Extension.OwnVertex vertex = null;
    java.util.Random rand = new java.util.Random();
    final int max = graph.getVertexCount();
    final int randomIntexPos = rand.nextInt(max);
    int i = 0;
    for (gka.GraphBuilder.Extension.OwnVertex v : graph.getVertices()) {
        if (i == randomIntexPos) {
            vertex = v;
            break;
        }else {
            vertex = v;
        }
        i++;
    }
    return vertex;
}