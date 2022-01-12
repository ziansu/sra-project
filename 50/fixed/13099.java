public io.github.endreman0.javajson.nodes.Node remove(int index) {
    io.github.endreman0.javajson.nodes.Node node = get(index);
    remove(node);
    return node;
}