public boolean[] getActiviationOfNeurons() {
    boolean[] activationResult = new boolean[neuroidsGraph.graph.elements.size()];
    for (int neuronI = 0; neuronI < (neuroidsGraph.graph.elements.size()); neuronI++) {
        activationResult[neuronI] = neuroidsGraph.graph.elements.get(neuronI).content.firing;
    }
    return activationResult;
}