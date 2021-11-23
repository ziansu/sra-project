@java.lang.Override
public solver.csp.Variable select(java.util.List<? extends solver.csp.Variable> unassigned) {
    int maxLength = 1;
    solver.csp.models.rowcol.RowColVariable maxLenVar = null;
    for (solver.csp.Variable basicVar : unassigned) {
        solver.csp.models.rowcol.RowColVariable var = ((solver.csp.models.rowcol.RowColVariable) (basicVar));
        if ((var.getMaxBlock()) >= maxLength) {
            maxLength = var.getMaxBlock();
            maxLenVar = var;
        }
    }
    return maxLenVar;
}