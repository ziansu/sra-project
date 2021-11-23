public double remove(int attribute, int mass) {
    (cardinalities[attribute])--;
    productOfCardinalities = mzoom.Suspiciousness.productOfCardinalities(cardinalities);
    this.mass -= mass;
    return density(this.mass, productOfCardinalities);
}