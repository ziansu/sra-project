public static Vector add(Vector u, Vector v) {
    Vector sum = new Vector(u.rows());
    java.math.BigDecimal sumValue;
    for (int row = 0; row < (u.rows()); row++) {
        sumValue = u.get(row).add(v.get(row));
        sum.set(row, sumValue);
    }
    return sum;
}