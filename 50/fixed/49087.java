public boolean equals(be.iminds.iot.dianne.tensor.Tensor other, float threshold) {
    if (!(this.sameDim(other)))
        return false;
    else
        return equalsData(other, threshold);
    
}