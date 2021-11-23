@java.lang.Override
public java.lang.Integer call(com.intel.sparkbench.bayes.Tuple3<java.lang.Double, java.lang.Integer[], java.lang.Double[]> v1) throws java.lang.Exception {
    java.lang.Integer[] indices = v1._2();
    if ((indices.length) > 0) {
        return indices[((indices.length) - 1)];
    }else
        return java.lang.Integer.valueOf(0);
    
}