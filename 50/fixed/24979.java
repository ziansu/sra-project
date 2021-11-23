public de.lutana.geodataextractor.entity.Location getMostLikelyLocation() {
    if (this.isEmpty()) {
        return null;
    }
    return this.first();
}