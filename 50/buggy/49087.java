public boolean equals(be.iminds.iot.dianne.tensor.Tensor other, float threshold) {
    if (!(this.sameDim(other))) {
        return false;
    }
    return equalsData(other, threshold);
}