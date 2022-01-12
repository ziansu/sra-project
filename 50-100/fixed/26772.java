public de.fuberlin.winfo.project.model.network.solution.Solution search(de.fuberlin.winfo.project.model.network.solution.Solution solution, de.fuberlin.winfo.project.algorithm.impl.sven.vns.CostFunction f) {
    this.centralSol = solution;
    init();
    while (hasNext()) {
        de.fuberlin.winfo.project.model.network.solution.Solution neighbor = next();
        if ((f.compare(solution, neighbor)) > 0) {
            java.lang.System.out.println("IMPROVEMENT");
            solution = neighbor;
        }
    } 
    return solution;
}