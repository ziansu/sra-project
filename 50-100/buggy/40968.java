@java.lang.Override
protected void configureNewInstance(com.cburch.logisim.instance.Instance instance) {
    instance.addAttributeListener();
    this.newlayout = instance.getAttributeValue(com.cburch.logisim.std.memory.AbstractFlipFlop.NEW_FF_LAYOUT);
    com.cburch.logisim.data.Bounds bds = instance.getBounds();
    updateports(instance);
    instance.setTextField(StdAttr.LABEL, StdAttr.LABEL_FONT, ((bds.getX()) + ((bds.getWidth()) / 2)), ((bds.getY()) - 3), GraphicsUtil.H_CENTER, GraphicsUtil.V_BASELINE);
}