@java.lang.Override
public java.lang.String get(int classId) {
    if ((classId < 0) || (classId > (classNames.length))) {
        throw new java.lang.IllegalArgumentException(("Invalid class id: " + classId));
    }
    return classNames[classId];
}