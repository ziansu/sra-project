public java.lang.String prettyPrint() {
    populateMatrix(root, (((rootInfo.rightDimension) * 2) + 1), 0);
    revertMatrix();
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    constructString(stringBuilder);
    return stringBuilder.toString();
}