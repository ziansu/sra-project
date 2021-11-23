private static void getPolynomialReachingEdges(MarioAI.graph.Node startingNode, short nodeColoumn, java.util.List<MarioAI.graph.DirectedEdge> listOfEdges) {
    MarioAI.SecondOrderPolynomial polynomial = new MarioAI.SecondOrderPolynomial(null, null);
    for (float jumpRange = 1; jumpRange <= (MarioAI.graph.Grapher.MAX_JUMP_RANGE); jumpRange++) {
        polynomial.setToJumpPolynomial(startingNode, nodeColoumn, jumpRange, MarioAI.graph.Grapher.JUMP_HEIGHT);
        MarioAI.graph.Grapher.jumpAlongPolynomial(startingNode, nodeColoumn, polynomial, listOfEdges);
    }
}