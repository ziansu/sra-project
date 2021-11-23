private double getNormalizedTaskDisplacement(us.ihmc.manipulation.planning.rrt.wholebodyplanning.TaskNode nodeOne, us.ihmc.manipulation.planning.rrt.wholebodyplanning.TaskNode nodeTwo) {
    double squaredDisplacement = 0;
    for (int i = 1; i < (rootNode.getDimensionOfNodeData()); i++) {
        double nodeOneValue = nodeOne.getNormalizedNodeData(i);
        double nodeTwoValue = nodeTwo.getNormalizedNodeData(i);
        squaredDisplacement = squaredDisplacement + ((nodeOneValue - nodeTwoValue) * (nodeOneValue - nodeTwoValue));
    }
    return java.lang.Math.sqrt(squaredDisplacement);
}