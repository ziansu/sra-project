@java.lang.Override
public float getCfROE() {
    if ((eoyEquity_) < 0.0F)
        return 0.0F;
    
    float x = ((cashflow_) + (ppe_)) / (((getStartEquity()) * 0.5F) + ((eoyEquity_) * 0.5F));
    if (x < (-3.0F))
        return -3.0F;
    
    if (x > 3.0F)
        return 3.0F;
    
    return x;
}