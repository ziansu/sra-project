@java.lang.Override
public double calcUnrealizedValue(double currentPrice) {
    return (calcOpeningValue()) + ((this.calcOpeningValue()) - ((calcAmountOutstanding()) * currentPrice));
}