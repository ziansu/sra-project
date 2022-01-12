public double StandardDeviation(java.util.ArrayList<java.lang.Double> l) {
    double mean = Meanfp(l);
    java.util.ArrayList<java.lang.Double> sd_list = new java.util.ArrayList<java.lang.Double>();
    for (java.lang.Double val : l) {
        if (val == null)
            val = ((java.lang.Double) (0.0));
        
        sd_list.add(java.lang.Math.pow((val - mean), 2));
    }
    return java.lang.Math.sqrt(Meanfp(sd_list));
}