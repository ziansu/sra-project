private void backpropogate(java.util.Stack<Experiment.MTreeNode> stack, double eval, boolean proven) {
    Experiment.MTreeNode node = stack.pop();
    if (proven) {
        node.lower = node.upper = java.lang.Math.round(eval);
        for (Experiment.MTreeNode parent : node.parents) {
            propagateBound(parent);
        }
    }
    backpropRec(stack, node, null, eval, 0);
}