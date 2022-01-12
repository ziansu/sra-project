@java.lang.Override
public float getCfROE() {
    float x = ((cashflow_) + (ppe_)) / (((getStartEquity()) * 0.5F) + ((eoyEquity_) * 0.5F));
    if (x < (-3.0F))
        return -3.0F;
    
    if (x > 3.0F)
        return 3.0F;
    
    return x;
}