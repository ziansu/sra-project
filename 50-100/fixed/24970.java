public void calculateZValue(int layer, int wire) {
    circuitValues[layer][wire] = (((wa) ^ ((e) & (circuitValues[(--layer)][wire]))) ^ ((d) & (circuitValues[(--layer)][(++wire)]))) ^ ((e) & (d));
}