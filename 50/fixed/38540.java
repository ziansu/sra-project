@java.lang.Override
public int hashCode() {
    int hc = 0;
    for (final STATE state : mStates) {
        hc += de.uni_freiburg.informatik.ultimate.util.HashUtils.hashJenkins(31, state);
    }
    return hc;
}