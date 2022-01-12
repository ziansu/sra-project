@java.lang.Override
public void calculateFilter(java.util.List<tudelft.ti2806.pl3.data.graph.Node> list) {
    for (tudelft.ti2806.pl3.data.graph.Node node : list) {
        for (tudelft.ti2806.pl3.data.Genome source : node.getSource()) {
            if (source.identifier.equals(genome)) {
                filter.add(node);
            }
        }
    }
}