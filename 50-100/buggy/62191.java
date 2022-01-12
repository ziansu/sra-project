@java.lang.Override
public float getROE() {
    float x = (profitAfterTax_) / (((getStartEquity()) * 0.5F) + ((eoyEquity_) * 0.5F));
    if (x < (-3.0F))
        return -3.0F;
    
    if (x > 3.0F)
        return 3.0F;
    
    return x > 0.0F ? x : 0.0F;
}