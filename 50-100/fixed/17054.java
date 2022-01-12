@java.lang.Override
public org.um.feri.ears.problems.DoubleSolution execute(org.um.feri.ears.problems.Task taskProblem) throws org.um.feri.ears.problems.StopCriteriaException {
    task = taskProblem;
    num_var = task.getNumberOfDimensions();
    stat = new org.um.feri.ears.algorithms.so.tlbo.Statistic(task);
    init();
    try {
        aTeacher();
    } catch (org.um.feri.ears.problems.StopCriteriaException e) {
        java.lang.System.out.println(e);
    }
    return stat.getCurrent_g().best;
}