public void deleteBundle(java.util.List<java.lang.Integer> indices) {
    for (java.lang.Integer i : indices) {
        zipFileList.get(i).delete();
    }
}