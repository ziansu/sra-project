@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof de.bmoth.modelchecker.State)) {
        return false;
    }
    if ((this) == obj) {
        return true;
    }
    de.bmoth.modelchecker.State that = ((de.bmoth.modelchecker.State) (obj));
    return this.values.equals(that.values);
}