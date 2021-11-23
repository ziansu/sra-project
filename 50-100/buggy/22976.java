public java.lang.Double getVariance() {
    java.lang.Double mean = getMean();
    java.lang.Double temp = 0.0;
    for (java.lang.Double a : this.data)
        temp += (mean - a) * (mean - a);
    
    return temp / (this.size);
}