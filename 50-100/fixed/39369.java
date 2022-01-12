public double StandardDeviation(java.util.ArrayList<java.lang.Long> l) {
    double mean = Mean(l);
    java.util.ArrayList<java.lang.Double> sd_list = new java.util.ArrayList<java.lang.Double>();
    for (java.lang.Long val : l) {
        if (val == null)
            val = ((long) (0));
        
        sd_list.add(java.lang.Math.pow((val - mean), 2));
    }
    return java.lang.Math.sqrt(Meanfp(sd_list));
}