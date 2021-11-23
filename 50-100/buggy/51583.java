public static Vector add(Vector u, Vector v) {
    Vector sum = new Vector(u.rows());
    java.math.BigDecimal sumValue;
    for (int row = 0; row < (u.rows()); row++) {
        sumValue = a.get(row).add(b.get(row));
        sum.set(row, sumValue);
    }
    return sum;
}