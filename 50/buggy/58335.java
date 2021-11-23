@java.lang.Override
public boolean init(final msi.gama.runtime.IScope scope) {
    this.scope = scope;
    scope.getGui().prepareForExperiment(scope.getExperiment().getSpecies());
    return super.init(scope);
}