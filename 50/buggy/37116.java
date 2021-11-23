public void setMeans(java.lang.String fileName) {
    java.lang.System.out.println(fileName);
    means = lv.edi.EDI_3DAtA.common.DenseMatrixConversions.loadCSVtoDenseMatrix(fileName);
}