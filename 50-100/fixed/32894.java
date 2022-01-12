private static java.util.List<MarioAI.Node> getPolynomialReachableNodes(MarioAI.Node startingNode, short nodeColoumn, java.util.List<MarioAI.Node> listOfNodes) {
    MarioAI.SecondOrderPolynomial polynomial = new MarioAI.SecondOrderPolynomial();
    for (float jumpRange = 1; jumpRange <= (MarioAI.Grapher.MAX_JUMP_RANGE); jumpRange++) {
        polynomial.setToJumpPolynomial(startingNode, nodeColoumn, jumpRange, MarioAI.Grapher.JUMP_HEIGHT);
        MarioAI.Grapher.jumpAlongPolynomial(startingNode, nodeColoumn, polynomial, listOfNodes);
    }
    return listOfNodes;
}