@msi.gaml.operators.operator(value = "remove_node_from", category = { IOperatorCategory.GRAPH }, concept = { IConcept.GRAPH , IConcept.NODE })
@msi.gaml.operators.doc(value = "removes a node from a graph.", comment = "all the edges containing this node are also removed.", examples = @msi.gaml.operators.example(value = "node(0) remove_node_from graphEpidemio", equals = "the graph without node(0)", isExecutable = false))
public static msi.gaml.operators.IGraph removeNodeFrom(final msi.gaml.operators.IShape node, final msi.gaml.operators.IGraph g) {
    g.removeVertex(node);
    return g;
}