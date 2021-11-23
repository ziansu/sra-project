@java.lang.Override
public boolean addEdge(V vertex1, V vertex2) {
    int index1 = vertices.indexOf(vertex1);
    int index2 = vertices.indexOf(vertex2);
    if ((index1 == (-1)) || (index2 == (-1)))
        return false;
    
    vertexMap.get(index1).add(index2);
    return true;
}