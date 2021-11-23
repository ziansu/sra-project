@java.lang.Override
public de.uni_freiburg.informatik.ultimate.core.model.services.ILogger getControllerLogger() {
    return new org.sosy_lab.cpachecker.core.algorithm.termination.lasso_analysis.toolchain.CPAcheckerLogger(logger, null);
}