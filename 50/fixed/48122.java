@java.lang.Override
public java.lang.String toString() {
    java.lang.String s;
    if ((completedAt) == null) {
        s = ToDo.UNDONE;
    }else {
        s = ToDo.DONE;
    }
    s += taskDescription;
    return s;
}