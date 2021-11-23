public void insert(java.lang.Double v) {
    sum += v;
    ssq += v * v;
    max = ((max) == null) ? v : java.lang.Math.max(max, v);
    min = ((min) == null) ? v : java.lang.Math.min(min, v);
    (n)++;
}