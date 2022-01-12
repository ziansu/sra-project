@java.lang.Override
public java.lang.Long call(com.intel.sparkbench.bayes.Tuple3<java.lang.Double, java.lang.Long[], java.lang.Double[]> v1) throws java.lang.Exception {
    java.lang.Long[] indices = v1._2();
    if ((indices.length) > 0) {
        return indices[((indices.length) - 1)];
    }else
        return java.lang.Long.valueOf(0);
    
}