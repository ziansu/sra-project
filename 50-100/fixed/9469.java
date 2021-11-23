private int computeNumElements(int bufSize) {
    if (bufSize == 0)
        return 0;
    
    switch (mode) {
        case Triangles :
            return bufSize / 3;
        case TriangleFan :
        case TriangleStrip :
            return bufSize - 2;
        case Points :
            return bufSize;
        case Lines :
            return bufSize / 2;
        case LineLoop :
            return bufSize;
        case LineStrip :
            return bufSize - 1;
        case Patch :
            return bufSize / (patchVertexCount);
        default :
            throw new java.lang.UnsupportedOperationException();
    }
}