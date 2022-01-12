public double percRoi() {
    return (((exitPrice) - (entryPrice)) / (entryPrice)) * ((quantity) > 0 ? 1 : -1);
}