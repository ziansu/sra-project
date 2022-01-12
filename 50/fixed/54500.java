private void setInnerSortingLayer(double value) {
    if (value < 0)
        value = 0;
    
    if (value >= 1)
        value = 1.0;
    
    _innerSortingLayer = value;
}