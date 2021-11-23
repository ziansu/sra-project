private static javax.vecmath.Vector3f read(java.lang.Object o) {
    if (o instanceof double[]) {
        double[] vec = ((double[]) (o));
        return (vec.length) < 3 ? null : new javax.vecmath.Vector3f(((float) (vec[0])), ((float) (vec[1])), ((float) (vec[2])));
    }else
        return null;
    
}