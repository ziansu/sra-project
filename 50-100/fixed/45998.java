public myscite.AncestorMatrix getAncestorMatrix() {
    int mSize = this.size();
    java.util.ArrayList<java.lang.String> nameSpace = this.muts;
    myscite.AncestorMatrix mMatrix = new myscite.AncestorMatrix(mSize);
    recBuildMatrix(this.root, mMatrix, nameSpace, mSize);
    java.lang.System.out.println(muts.size());
    java.lang.System.out.println(mMatrix.size());
    java.lang.System.out.println(mSize);
    mMatrix.setNameSpace(new myscite.MutationNameSpace(nameSpace));
    return mMatrix;
}