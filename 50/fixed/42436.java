@java.lang.Override
public double calcUnrealizedValue(double currentPrice) {
    if ((calcAmountOutstanding()) == 0)
        return 0;
    
    return (calcOpeningValue()) + ((this.calcOpeningValue()) - ((calcAmountOutstanding()) * currentPrice));
}