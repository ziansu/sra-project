public myscite.AncestorMatrix getAncestorMatrix() {
    int mSize = this.size();
    java.util.ArrayList<java.lang.String> nameSpace = this.muts;
    myscite.AncestorMatrix mMatrix = new myscite.AncestorMatrix(mSize);
    recBuildMatrix(this.root, mMatrix, nameSpace, mSize);
    mMatrix.setNameSpace(new myscite.MutationNameSpace(nameSpace));
    return mMatrix;
}