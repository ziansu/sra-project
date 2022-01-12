private boolean checkConsistency(cspSolver.Variable v) {
    boolean isConsistent = false;
    switch (cChecks) {
        case None :
            isConsistent = assignmentsCheck();
            break;
        case ForwardChecking :
            isConsistent = forwardChecking(v);
            break;
        case ArcConsistency :
            isConsistent = arcConsistency(v);
            break;
        default :
            isConsistent = assignmentsCheck();
            break;
    }
    return isConsistent;
}