public java.util.List<java.io.File> getSelectedFiles(java.util.List<java.lang.Integer> selectedFileIndices) throws java.io.IOException {
    java.util.List<java.io.File> list = new java.util.ArrayList<java.io.File>();
    java.util.List<java.io.File> zipFileList = getZipFileList();
    for (java.lang.Integer i : selectedFileIndices) {
        list.add(zipFileList.get(i));
    }
    return list;
}