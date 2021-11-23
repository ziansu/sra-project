public boolean addVertex(double x, double y) {
    for (int index = 0; index <= (_noOfVertices); index++) {
        if ((_vertices[index]) == null) {
            _vertices[index] = new Point(x, y);
            _noOfVertices += 1;
            return true;
        }
    }
    return false;
}