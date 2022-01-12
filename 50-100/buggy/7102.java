static boofcv.alg.feature.detect.squares.SquareNode pickNot(boofcv.alg.feature.detect.squares.SquareNode target, boofcv.alg.feature.detect.squares.SquareNode child0, boofcv.alg.feature.detect.squares.SquareNode child1) {
    for (int i = 0; i < 4; i++) {
        boofcv.alg.feature.detect.squares.SquareEdge e = target.edges[i];
        boofcv.alg.feature.detect.squares.SquareNode c = e.destination(target);
        if ((c != child0) && (c != child1))
            return c;
        
    }
    throw new java.lang.RuntimeException("There was no odd one out some how");
}