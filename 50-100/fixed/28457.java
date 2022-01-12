public static com.seniorproject.graphmodule.NodeIterable markColor(com.seniorproject.graphmodule.NodeIterable nodes, int totalCommunities, int coloringType, java.lang.String[] colors) {
    if (coloringType == (com.seniorproject.processingmodule.Coloring.RANDOM_COLOR)) {
        colors = com.seniorproject.processingmodule.Coloring.generateColor(totalCommunities);
    }
    for (com.seniorproject.graphmodule.Node n : nodes) {
        n.setProperty("color", colors[java.lang.Integer.parseInt(n.getProperty("communityID").toString())]);
    }
    return nodes;
}