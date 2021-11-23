public static void main(java.lang.String[] args) throws ilog.concert.IloException {
    Runner.showDelimiter();
    for (Exercise exercise : Runner.exercises) {
        java.lang.System.out.println(exercise.getClass().getSimpleName());
        Runner.showDelimiter();
        ilog.cplex.IloCplex cplex = new ilog.cplex.IloCplex();
        exercise.setUpModel(cplex);
        cplex.solve();
        java.lang.System.out.println("Results:");
        exercise.showResults(cplex);
        Runner.showDelimiter();
        exercise.getPostExecutionData(cplex);
        Runner.showDelimiter();
    }
}