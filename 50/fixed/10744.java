public boolean isLessOrEqual(org.sosy_lab.cpachecker.cpa.specinference.SpecInferenceState other) {
    if ((handle) == null) {
        return true;
    }else {
        return automaton.toString().equals(other.automaton.toString());
    }
}