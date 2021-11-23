private static java.util.Map<java.lang.Class<? extends org.apache.ignite.math.Vector>, java.lang.Class<? extends org.apache.ignite.math.Matrix>> typesMap() {
    return new java.util.LinkedHashMap<java.lang.Class<? extends org.apache.ignite.math.Vector>, java.lang.Class<? extends org.apache.ignite.math.Matrix>>() {
        {
            put(org.apache.ignite.math.impls.vector.DenseLocalOnHeapVector.class, org.apache.ignite.math.impls.matrix.DenseLocalOnHeapMatrix.class);
            put(org.apache.ignite.math.impls.vector.DenseLocalOffHeapVector.class, org.apache.ignite.math.impls.matrix.DenseLocalOffHeapMatrix.class);
            put(org.apache.ignite.math.impls.vector.RandomVector.class, org.apache.ignite.math.impls.matrix.RandomMatrix.class);
            put(org.apache.ignite.math.impls.vector.SparseLocalOnHeapVector.class, org.apache.ignite.math.impls.matrix.SparseLocalOnHeapMatrix.class);
            put(org.apache.ignite.math.impls.vector.SingleElementVector.class, null);
            put(org.apache.ignite.math.impls.vector.ConstantVector.class, null);
        }
    };
}