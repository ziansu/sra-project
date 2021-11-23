public org.apache.spark.mllib.linalg.Vector call(java.lang.String s) {
    java.lang.String[] sarray = s.split(" ");
    double[] values = new double[sarray.length];
    for (int i = 0; i < (sarray.length); i++)
        values[i] = java.lang.Double.parseDouble(sarray[i]);
    
    return org.apache.spark.mllib.linalg.Vectors.dense(values);
}