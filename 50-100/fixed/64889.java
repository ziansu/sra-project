public com.kushalarora.compositionalLM.model.IParameterDerivatives<java.util.List<com.kushalarora.compositionalLM.lang.Word>> calcDerivative(java.util.List<com.kushalarora.compositionalLM.lang.Word> data, com.kushalarora.compositionalLM.model.CompositionalGrammar.CompositionalInsideOutsideScore scorer) {
    dqdu.calcDerivative(data, scorer);
    dqdw.calcDerivative(data, scorer);
    dqdxw.calcDerivative(data, scorer);
    return this;
}