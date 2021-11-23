public static java.lang.Integer hashPartition(java.lang.Object o) {
    if (o == null)
        return null;
    else
        return java.lang.Math.abs(o.hashCode());
    
}