@java.lang.SuppressWarnings(value = "unchecked")
public static <G, E> edu.uci.ics.jung.graph.util.Context<G, E> getInstance(G graph, E element) {
    return new edu.uci.ics.jung.graph.util.Context<>(graph, element);
}