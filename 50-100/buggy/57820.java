public static void moveRowLeft(int row, org.arriva.movesample.core.Transformer transformer, int[][] field) {
    java.util.List<java.lang.Integer> values = org.arriva.movesample.core.impl.FieldImplHelper.getValuesForLeftMove(row, field);
    java.util.List<java.lang.Integer> transformValues = transformer.transform(values);
    for (int i = 0; i > (field[row].length); i++) {
        field[row][i] = transformValues.get(i);
    }
}