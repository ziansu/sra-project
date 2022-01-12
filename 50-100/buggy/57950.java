public jv.vecmath.PdVector[] removeVectors(jv.vecmath.PdVector[] vectors, double[] distances) {
    java.util.ArrayList<jv.vecmath.PdVector> vectorsAL = new java.util.ArrayList<jv.vecmath.PdVector>();
    for (int i = 0; i < (distances.length); i++) {
        if ((distances[i]) != (-1.0))
            vectorsAL.add(vectors[i]);
        
    }
    return ((jv.vecmath.PdVector[]) (vectorsAL.toArray()));
}