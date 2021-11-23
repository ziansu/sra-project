@java.lang.Override
public boolean apply(gobblin.configuration.WorkUnitState input) {
    return !(input.getWorkingState().equals(WorkingState.SUCCESSFUL));
}