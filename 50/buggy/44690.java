public double percRoi() {
    return (java.lang.Math.log(((exitPrice) / (entryPrice)))) * ((quantity) > 0 ? 1 : -1);
}