private boolean commonPassedParametersAlreadyContainOneOfTheKeys(gr.uom.java.ast.decomposition.cfg.mapping.VariableBindingKeyPair keyPair) {
    for (gr.uom.java.ast.decomposition.cfg.mapping.VariableBindingKeyPair key : commonPassedParameters.keySet()) {
        if ((key.getKey1().equals(keyPair.getKey1())) || (key.getKey2().equals(keyPair.getKey2()))) {
            return true;
        }
    }
    return false;
}