public double pottsEnergy(int i, int j) {
    double energy = alpha;
    if (i == j)
        energy = 0.0;
    
    if (((i != j) && (i == 0)) || (j == 0))
        energy = beta;
    
    return energy;
}