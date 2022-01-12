public void insert(java.lang.Double v) {
    sum += v;
    ssq += v * v;
    max = ((max) == null) ? null : java.lang.Math.max(max, v);
    min = ((min) == null) ? null : java.lang.Math.min(min, v);
    (n)++;
}