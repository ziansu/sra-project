@java.lang.Override
public void setWeight(float weight) {
    if (weight > 12)
        weight = 12;
    
    if (weight < (-12))
        weight = -12;
    
    this.weightJustChanged = weight != (this.weight);
    this.weight = weight;
}