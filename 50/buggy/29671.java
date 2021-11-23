public void update(biomorphHandling.Biomorph biomorph) {
    this.biomorph = biomorph;
    bc.setBiomorph(biomorph);
    revalidate();
}