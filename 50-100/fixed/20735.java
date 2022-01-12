static boofcv.alg.feature.detect.squares.SquareNode pickNot(boofcv.alg.feature.detect.squares.SquareNode target, boofcv.alg.feature.detect.squares.SquareNode child) {
    for (int i = 0; i < 4; i++) {
        boofcv.alg.feature.detect.squares.SquareEdge e = target.edges[i];
        if (e == null)
            continue;
        
        boofcv.alg.feature.detect.squares.SquareNode c = e.destination(target);
        if (c != child)
            return c;
        
    }
    throw new java.lang.RuntimeException("There was no odd one out some how");
}