@java.lang.Override
public java.util.Vector plus(double x) {
    java.util.Vector cp = copy();
    if (x != 0.0)
        cp.map(org.apache.ignite.math.impls.vector.Functions.plus(x));
    
    return cp;
}