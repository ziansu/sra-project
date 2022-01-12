public double getWorkLoadSD() {
    final java.lang.Double mean = getMeanWorkLoad();
    final java.lang.Double sumSquare = 0.0;
    workLoads.values().stream().collect(java.util.stream.Collectors.summingDouble(( value) -> java.lang.Math.pow(((value.doubleValue()) - mean), 2.0)));
    return java.lang.Math.sqrt((sumSquare / (((double) (workLoads.size())) - 1.0)));
}