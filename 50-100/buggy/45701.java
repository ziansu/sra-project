private void ensureTiers(int tier) {
    for (int i = (tierSpecs.size()) + 1; i <= tier; i++) {
        tierSpecs.add(new java.util.LinkedHashSet<edu.cmu.tetrad.data.Knowledge2.MyNode>());
        for (int j = 0; j < i; j++) {
            forbiddenRulesSpecs.add(new edu.cmu.tetrad.data.OrderedPair(tierSpecs.get(i), tierSpecs.get(j)));
        }
    }
}