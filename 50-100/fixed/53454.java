private java.lang.String realVectorToString(org.apache.commons.math3.linear.RealVector vec) {
    java.lang.String[] arr = new java.lang.String[vec.getDimension()];
    for (int i = 0; i < (vec.getDimension()); i++) {
        arr[i] = java.lang.Double.valueOf(vec.getEntry(i)).toString();
    }
    return org.apache.commons.lang3.StringUtils.join(arr, "\t");
}