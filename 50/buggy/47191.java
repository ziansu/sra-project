@java.lang.Override
public void setMaxValue(int maxValue) {
    if (maxValue < 0)
        this.maxValue = 0;
    
    this.maxValue = maxValue;
}