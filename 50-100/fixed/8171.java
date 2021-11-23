public heronarts.p3lx.ui.component.UIDoubleBox setParameter(final heronarts.lx.parameter.BoundedParameter parameter) {
    if ((this.parameter) != null) {
        this.parameter.removeListener(this.parameterListener);
    }
    this.parameter = parameter;
    if (parameter != null) {
        this.minValue = parameter.range.min;
        this.maxValue = parameter.range.max;
        this.parameter.addListener(this.parameterListener);
        setValue(parameter);
    }
    return this;
}