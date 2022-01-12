@java.lang.Override
public boolean equals(java.lang.Object edge) {
    if (edge instanceof allnearestneighbours.VoronoiEdge)
        return (((allnearestneighbours.VoronoiEdge) (edge)).beginVertex.equals(beginVertex)) && (((allnearestneighbours.VoronoiEdge) (edge)).endVertex.equals(endVertex));
    
    return false;
}