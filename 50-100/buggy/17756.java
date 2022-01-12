private java.lang.String calculateRepresentant() {
    java.lang.String rep = null;
    java.lang.Double repRatio = 0.0;
    for (java.lang.String value : valueDistribution.keySet())
        if ((valueDistribution.get(value)) > repRatio) {
            rep = value;
            repRatio = valueDistribution.get(value);
        }
    
    return rep;
}