public java.util.List<pl.edu.agh.footprint.age.solution.CarbonFootprintSolution.SolutionTreeNode> getAllPreOrder() {
    java.util.List<pl.edu.agh.footprint.age.solution.CarbonFootprintSolution.SolutionTreeNode> allNodes = java.util.Collections.emptyList();
    getAllPreOrder(root, allNodes);
    return allNodes;
}