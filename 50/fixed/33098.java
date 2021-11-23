public void save_adjacency_matrix_map(java.lang.String sourceClass, java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>>> outlinks) {
    paths.put(sourceClass, outlinks);
    recMan.commit();
    recMan.close();
}