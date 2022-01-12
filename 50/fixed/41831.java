public static double[] toPrimitives(java.util.List<java.lang.Double> values) {
    if (values == null)
        return null;
    
    return values.stream().mapToDouble(java.lang.Double::doubleValue).toArray();
}