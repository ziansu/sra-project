@java.lang.Override
public boolean init(final msi.gama.runtime.IScope scope) {
    scope.getGui().waitStatus(" Building outputs ");
    boolean result = super.init(scope);
    if (result) {
        scope.getGui().updateSimulationState();
    }
    return result;
}