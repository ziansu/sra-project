@org.junit.Test
public void kNormTest() {
    for (double pow : new double[]{ 0 , 0.5 , 1 , 2 , 2.5 , java.lang.Double.POSITIVE_INFINITY })
        toDoubleTest(( ref) -> new org.apache.ignite.math.impls.vector.VectorImplementationsTest.Norm(ref, pow).calculate(), ( v) -> v.kNorm(pow));
    
}