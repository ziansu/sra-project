@java.lang.Override
public boolean equals(final java.lang.Object obj) {
    if (obj == null) {
        return (this) == null;
    }
    if ((getClass()) != (obj.getClass())) {
        return false;
    }
    return ((de.uni_freiburg.informatik.ultimate.automata.nwalibrary.CompoundState<?>) (obj)).getStates().equals(this.getStates());
}