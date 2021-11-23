public static void main(java.lang.String[] args) {
    boolean doUpdate = SchedulerDBHelper.needsUpdate();
    if (!doUpdate) {
        java.lang.System.out.println("No update to recommendations needed");
        return ;
    }
    java.lang.System.out.println("Let's do the update");
    BasicGurobiOptimizer opt = new BasicGurobiOptimizer();
    try {
        opt.setup();
        opt.optimize();
        opt.printSolution();
        opt.storeSolution();
    } catch (java.lang.Exception err) {
        err.printStackTrace();
    }
}