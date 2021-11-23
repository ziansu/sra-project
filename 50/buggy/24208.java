public void save_tf_Idf_map(java.lang.String graphIRI, java.lang.Double tf_Idf_value) {
    try {
        pagerank_map.put(graphIRI, tf_Idf_value);
        recMan.commit();
        recMan.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}