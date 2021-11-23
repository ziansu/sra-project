public void calculateZValue(int layer, int wire) {
    circuitValues[layer][wire] = ((wb) ^ ((e) & (circuitValues[(layer - 1)][wire]))) ^ ((d) & (circuitValues[(layer - 1)][(wire + 1)]));
}