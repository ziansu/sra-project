@java.lang.Override
public java.lang.String toString() {
    java.lang.String s;
    if ((completedAt) == null) {
        s = ToDo.DONE;
    }else {
        s = ToDo.UNDONE;
    }
    s += taskDescription;
    return s;
}