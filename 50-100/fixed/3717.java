public java.util.LinkedList<com.example.finalproject.shottestpath.Vertex> drawPath(com.example.finalproject.shottestpath.Vertex Node) {
    java.util.LinkedList<com.example.finalproject.shottestpath.Vertex> linePath = getPath(Node, endNode);
    pathview.setPath(linePath);
    android.util.Log.i("Linklist", linePath.toString());
    if ((endNode) == null) {
        return null;
    }
    return linePath;
}