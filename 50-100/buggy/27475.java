public Point highestVertex() {
    Point highestPoint = ((_noOfVertices) > 0) ? _vertices[0] : null;
    for (int index = 0; index < (_noOfVertices); index++) {
        if (((_vertices[index]) != null) && (_vertices[index].isAbove(highestPoint))) {
            highestPoint = _vertices[index];
        }
    }
    return new Point(highestPoint);
}