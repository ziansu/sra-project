public boolean equals(java.lang.Object other) {
    if (other == null)
        return false;
    
    if ((this) == other)
        return true;
    
    if ((other.getClass()) != (getClass()))
        return false;
    
    main.Vertices.Vertex v1 = ((main.Vertices.Vertex) (other));
    return this.data.equals(v1.data);
}