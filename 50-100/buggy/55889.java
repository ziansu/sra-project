private void print(final java.util.function.Consumer<T> consumer) {
    for (int row = 0; row < (matrix.size()); ++row) {
        java.lang.System.out.print((row + "\t -> "));
        final java.util.Vector<T> rowValues = matrix.get(row);
        for (int col = 0; col < (rowValues.size()); ++col) {
            consumer.accept(rowValues.get(col));
        }
        java.lang.System.out.println();
    }
}