@java.lang.Override
public de.uni_freiburg.informatik.ultimatetest.decider.ITestResultDecider constructITestResultDecider(de.uni_freiburg.informatik.ultimatetest.UltimateRunDefinition urd) {
    return new de.uni_freiburg.informatik.ultimatetest.decider.SafetyCheckTestResultDecider(urd, false);
}