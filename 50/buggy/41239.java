@java.lang.SuppressWarnings(value = "unchecked")
public static <G, E> edu.uci.ics.jung.graph.util.Context<G, E> getInstance(G graph, E element) {
    edu.uci.ics.jung.graph.util.Context.instance.graph = graph;
    edu.uci.ics.jung.graph.util.Context.instance.element = element;
    return edu.uci.ics.jung.graph.util.Context.instance;
}