@org.junit.Test
public void it_doesnt_return_the_neighbour_on_an_edge_if_we_dont_give_a_valid_vertex() {
    com.piratesgame.graph.vertices.Vertex v1 = new com.piratesgame.graph.vertices.Vertex("Manchester");
    com.piratesgame.graph.vertices.Vertex v2 = new com.piratesgame.graph.vertices.Vertex("Swansea");
    com.piratesgame.graph.vertices.Vertex v3 = new com.piratesgame.graph.vertices.Vertex("London");
    com.piratesgame.graph.Edge e = new com.piratesgame.graph.Edge(v1, v2);
    assertNull(e.getNeighbour(v3));
}