@java.lang.Override
public boolean equals(java.lang.Object edge) {
    return ((edge instanceof allnearestneighbours.VoronoiEdge) && (((allnearestneighbours.VoronoiEdge) (edge)).beginVertex.equals(beginVertex))) && (((allnearestneighbours.VoronoiEdge) (edge)).endVertex.equals(endVertex));
}