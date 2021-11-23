public static Vector multiply(Vector u, Vector v) {
    Vector product = new Vector(u.rows());
    java.math.BigDecimal productValue;
    for (int row = 0; row < (u.rows()); row++) {
        productValue = a.get(row).multiply(b.get(row));
        product.set(row, productValue);
    }
    return product;
}