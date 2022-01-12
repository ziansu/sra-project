com.company.task8.Matrix multiplication(double a) {
    com.company.task8.Matrix result = new com.company.task8.Matrix(this.strings, this.columns);
    for (int i = 0; i < (this.strings); i++) {
        for (int j = 0; j < (this.columns); j++) {
            result.matrix[i][j] = (this.matrix[i][j]) * a;
        }
    }
    return result;
}