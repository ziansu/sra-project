@java.lang.Override
public java.lang.String toString() {
    java.lang.String retur = (((((((((name) + ", ") + (year)) + ", ") + (description)) + ", ") + (posterLink)) + ", ") + (genre)) + ", ";
    for (int i = 0; i < (actors.length); i++) {
        retur += (actors[i]) + ", ";
    }
    return retur;
}