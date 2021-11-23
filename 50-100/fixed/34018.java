@java.lang.Override
public org.sat4j.specs.IProblem parseInstance(final java.io.Reader input) throws org.sat4j.reader.ParseFormatException, org.sat4j.specs.ContradictionException {
    super.parseInstance(input);
    if ((lexico) == null) {
        this.solver.setObjectiveFunction(getObjectiveFunction());
    }
    return ((org.sat4j.pb.PBSolverHandle) (solver)).decorated();
}