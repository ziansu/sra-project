public java.util.List<org.corpus_tools.pepper.common.ModuleFitness> checkHealth(final java.util.Collection<org.corpus_tools.pepper.modules.PepperModule> modules) {
    final java.util.List<org.corpus_tools.pepper.common.ModuleFitness> moduleFitness = new java.util.ArrayList<>();
    if (modules == null) {
        return moduleFitness;
    }
    for (org.corpus_tools.pepper.modules.PepperModule module : modules) {
        if (module != null) {
            moduleFitness.add(checkHealth(module));
        }
    }
    return moduleFitness;
}