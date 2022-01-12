public void setLastStep(int u, int v) {
    int color = graph[u][v];
    steps.push(new int[]{ u , v });
    if (((colors.length) - 1) == color) {
        colors = java.util.Arrays.copyOf(colors, ((colors.length) * 2));
    }
    (colors[(color - 1)])++;
    this.setChanged();
    this.notifyObservers();
}