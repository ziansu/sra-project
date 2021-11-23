@java.lang.Override
public final void setForbidden(java.lang.String spec1, java.lang.String spec2) {
    addVariable(spec1);
    addVariable(spec2);
    spec1 = checkSpec(spec1);
    spec2 = checkSpec(spec2);
    java.util.Set<edu.cmu.tetrad.data.Knowledge2.MyNode> f1 = getExtent(spec1);
    java.util.Set<edu.cmu.tetrad.data.Knowledge2.MyNode> f2 = getExtent(spec2);
    edu.cmu.tetrad.data.OrderedPair<java.util.Set<edu.cmu.tetrad.data.Knowledge2.MyNode>> o = new edu.cmu.tetrad.data.OrderedPair(f1, f2);
    if (!(forbiddenRulesSpecs.contains(o))) {
        forbiddenRulesSpecs.add(o);
    }
}