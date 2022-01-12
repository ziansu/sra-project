epmc.value.ValueAlgebra evaluateProbability(epmc.jani.explorer.NodeJANI node) {
    epmc.value.ValueAlgebra result = epmc.value.ValueAlgebra.as(probability.evaluate(node.getValues()));
    if ((ge) != null) {
        ge.apply(cmp, result, zeroWeight);
        epmc.error.UtilError.ensure(cmp.getBoolean(), ProblemsJANIExplorer.JANI_EXPLORER_NEGATIVE_WEIGHT);
    }
    setProbability.apply(probabilityV, result);
    return probabilityV;
}