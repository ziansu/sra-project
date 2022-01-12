@java.lang.Override
public void Solve() {
    Result = new java.lang.Integer[N][M];
    for (int j = 0; j < (N); j++) {
        for (int k = 0; k < (M); k++) {
            Result[j][k] = (A[j][k]) + (B[j][k]);
        }
    }
}