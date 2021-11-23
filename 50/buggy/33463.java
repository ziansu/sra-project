void setData(java.awt.Container container, flat.layout.linear.Orientation orientation) {
    autoWeightSumIfAbsent();
    inspectValidState();
    this.container = container;
    this.orientation = orientation;
    calculator.setData(this.container, this.orientation);
}