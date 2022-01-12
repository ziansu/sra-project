public java.lang.String[] translate(java.lang.String[] instructions) {
    java.lang.String[] temp = translateLoops(instructions);
    temp = getMath(temp);
    return getAssignments(temp);
}