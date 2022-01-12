public void addPoint(eu.daiad.web.model.AmphiroAbstractDataPoint point) {
    this.volume += point.getVolume();
    this.energy += point.getEnergy();
    this.temperature = ((this.temperature) * (this.count)) + (point.getTemperature());
    (this.count)++;
    this.temperature /= ((float) (this.count));
}