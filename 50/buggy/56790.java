private static com.healthmarketscience.jackcess.Row createT1Row(int id1, int fk1, int fk2, java.lang.String data, int fk3) {
    return createExpectedRow("id", id1, "otherfk1", fk1, "otherfk2", fk2, "data", data, "otherfk3", fk3);
}