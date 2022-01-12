@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((o == null) || (!(o instanceof Event))) {
        return false;
    }
    Event e = ((Event) (o));
    assertObjectNotNull(this);
    boolean isSame = (this.taskID) == (e.taskID);
    return isSame;
}