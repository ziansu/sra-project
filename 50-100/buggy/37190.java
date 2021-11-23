@java.lang.Override
public edu.illinois.cs.cogcomp.sl.util.WeightVector train(edu.illinois.cs.cogcomp.sl.core.SLProblem sp, edu.illinois.cs.cogcomp.sl.util.WeightVector init) throws java.lang.Exception {
    edu.illinois.cs.cogcomp.sl.core.AbstractInferenceSolver[] solvers = new edu.illinois.cs.cogcomp.sl.core.AbstractInferenceSolver[num_threads];
    for (int i = 0; i < (num_threads); i++) {
        solvers[i] = ((edu.illinois.cs.cogcomp.sl.core.AbstractInferenceSolver) (infSolver.clone()));
    }
    edu.illinois.cs.cogcomp.sl.util.WeightVector w = trainParallelStructuredPerceptron(solvers, sp, parameters);
    edu.illinois.cs.cogcomp.sl.learner.structured_perceptron.StructuredPerceptronIPM.log.info("Finished!");
    return w;
}