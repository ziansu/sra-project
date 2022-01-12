@java.lang.Override
public boolean equals(final java.lang.Object arg0) {
    if (arg0 == null) {
        return (this) == null;
    }
    if ((getClass()) != (arg0.getClass())) {
        return false;
    }
    return ((de.uni_freiburg.informatik.ultimate.automata.nwalibrary.CompoundState<?>) (arg0)).getStates().equals(this.getStates());
}