public void setWindows(java.lang.String value) {
    this.windows = value;
    if ((currentOS) == (org.esa.snap.core.gpf.descriptor.SystemDependentVariable.OS.windows)) {
        setValue(value);
    }
}