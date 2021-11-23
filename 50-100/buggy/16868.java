public double classifyInstance(weka.core.Instance instance) throws java.lang.Exception {
    if (this.m_isLeaf) {
        return this.m_leafModel.classifyInstance(instance);
    }
    weka.core.Attribute chosen = this.getChosenAttribute();
    java.lang.System.out.println(("Chosen value " + (instance.stringValue(chosen))));
    weka.classifiers.trees.occt.tree.OCCTInternalClassifierNode relevantSon = this.m_sons.get(instance.stringValue(chosen));
    return relevantSon.classifyInstance(instance);
}