public de.fuberlin.winfo.project.model.network.solution.Solution search(de.fuberlin.winfo.project.model.network.solution.Solution solution, de.fuberlin.winfo.project.algorithm.impl.sven.vns.CostFunction f) {
    this.initialSol = solution;
    this.incumbentSol = solution;
    init();
    while (hasNext()) {
        de.fuberlin.winfo.project.model.network.solution.Solution candidate = next();
        if (((f.compare(incumbentSol, candidate)) > 0) && (checkRestrictions(candidate))) {
            history.neighborhoodChange(this, incumbentSol, candidate, "improved");
            incumbentSol = candidate;
        }
    } 
    return incumbentSol;
}