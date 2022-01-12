public void put(double sample) {
    (n)++;
    double delta = sample - (mean);
    mean = (mean) + (delta / (n));
    M2 = (M2) + (delta * (sample - (mean)));
    max = org.apache.commons.math3.util.FastMath.max(this.max, sample);
    min = org.apache.commons.math3.util.FastMath.min(this.min, sample);
}