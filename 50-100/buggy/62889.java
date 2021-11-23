private void init(boolean resetAssignments) {
    for (softsat.objects.Variable var : activeVars) {
        if (resetAssignments) {
            var.randomFlip();
        }
    }
    for (softsat.objects.Variable var : activeVars) {
        var.setMakeBreakCounts();
    }
    unsatisfied = new softsat.util.HashArray<softsat.objects.Clause>();
    for (softsat.objects.Clause clause : clauses) {
        if (!(clause.isSat())) {
            unsatisfied.add(clause);
        }
    }
}