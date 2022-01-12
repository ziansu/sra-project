private static com.healthmarketscience.jackcess.Row createT1Row(int id1, java.lang.Integer fk1, java.lang.Integer fk2, java.lang.String data, java.lang.Integer fk3) {
    return createExpectedRow("id", id1, "otherfk1", fk1, "otherfk2", fk2, "data", data, "otherfk3", fk3);
}