@java.lang.Override
public boolean equals(java.lang.Object t) {
    if ((t == null) | (!(t instanceof cs2103.v15_1j.jimjim.model.DeadlineTask))) {
        return false;
    }
    cs2103.v15_1j.jimjim.model.DeadlineTask other = ((cs2103.v15_1j.jimjim.model.DeadlineTask) (t));
    return (this.getName().equals(other.getName())) && (this.getDateTime().equals(other.getDateTime()));
}