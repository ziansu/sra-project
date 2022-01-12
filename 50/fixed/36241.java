public int getCurrentVertexID() {
    if ((established_arrivals) > 1) {
        return vertices.get(((established_arrivals) - 1));
    }else
        return vertices.get(0);
    
}