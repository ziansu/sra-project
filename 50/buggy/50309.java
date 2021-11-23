@java.lang.Override
public double getBaseMaxPower() {
    if ((this.panel) != null) {
        return panel.internalCapacity;
    }
    return 0;
}