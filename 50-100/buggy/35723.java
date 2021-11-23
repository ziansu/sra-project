private float getNodeExplorationValue() {
    if ((parentNode) == null)
        return 0.0F;
    
    int parentSimulations = parentNode.nodeResults.getNumSimulations();
    return (EXPLORATION_CONSTANT) * ((float) (java.lang.Math.sqrt(((java.lang.Math.log((parentSimulations + 1))) / ((nodeResults.getNumSimulations()) + 1)))));
}