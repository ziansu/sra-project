private double entropy(double p) {
    if ((p == 0) || (p == 1)) {
        return 1;
    }else {
        return ((-p) * ((java.lang.Math.log(p)) / (java.lang.Math.log(2)))) - ((1 - p) * ((java.lang.Math.log((1 - p))) / (java.lang.Math.log(2))));
    }
}