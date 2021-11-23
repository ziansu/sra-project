public Jama.Matrix quaternionToMatrix(com.jogamp.graph.math.Quaternion q) {
    Jama.Matrix m = new Jama.Matrix(4, 4);
    float[] matrix = q.toMatrix();
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            m.set(i, j, matrix[(i + j)]);
        }
    }
    return m;
}