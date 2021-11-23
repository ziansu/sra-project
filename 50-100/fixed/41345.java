public void setLayoutData(de.jwic.base.Control control, de.jwic.controls.layout.TableData layoutData) {
    if ((control.getContainer()) != (this)) {
        throw new java.lang.IllegalArgumentException("The specified control is not member of this container.");
    }
    allLayoutInfos.put(control.getName(), (layoutData != null ? layoutData : new de.jwic.controls.layout.TableData()));
    requireRedraw();
    cells = null;
}