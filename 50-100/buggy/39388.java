@java.lang.Override
public double massBetween(java.lang.Integer start, java.lang.Integer end) {
    end = java.lang.Math.min(end, ((n) - 1));
    start = java.lang.Math.max(start, 0);
    return ((end - start) + 1) / (n);
}