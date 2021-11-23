@java.lang.Override
public java.util.List<io.github.endreman0.javajson.nodes.Node> subList(int fromIndex, int toIndex) {
    return new io.github.endreman0.javajson.nodes.ArrayNode(children.subList(fromIndex, toIndex));
}