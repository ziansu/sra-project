@java.lang.Override
public boolean setValue(java.lang.Boolean value, boolean fire) {
    if (isAttached())
        ((com.google.gwt.dom.client.InputElement) (getInputElement().cast())).setChecked((value == null ? false : value));
    
    return super.setValue(value, fire);
}