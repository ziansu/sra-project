private java.util.ArrayList<edu.asu.anisha.core.Edge> getListOfEdges(java.util.ArrayList<java.lang.Double> arrayList) {
    java.util.ArrayList<edu.asu.anisha.core.Edge> listOfEdges = new java.util.ArrayList<edu.asu.anisha.core.Edge>();
    for (int i = 0; i < (arrayList.size()); i++) {
        if ((arrayList.get(i)) > 0.0)
            listOfEdges.add(g.getEdge(i));
        
    }
    return listOfEdges;
}