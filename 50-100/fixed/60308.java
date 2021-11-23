private void addArista(int i, int j) {
    java.util.List<util.Grafo.AristaDirigida> set;
    if (!(verticesConAristas.containsKey(i)))
        verticesConAristas.put(i, new java.util.ArrayList<util.Grafo.AristaDirigida>());
    
    set = verticesConAristas.get(i);
    set.add(new util.Grafo.AristaDirigida(i, j));
}