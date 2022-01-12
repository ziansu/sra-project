public void clearHistory() {
    for (int i = 0; i < 6; i++) {
        java.util.Arrays.fill(history[i], ((short) (0)));
    }
}