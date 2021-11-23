@java.lang.Override
public void Solve() {
    for (int j = 0; j < (N); j++) {
        for (int k = 0; k < (M); k++) {
            Result[j][k] = (A[j][k]) + (B[j][k]);
        }
    }
}