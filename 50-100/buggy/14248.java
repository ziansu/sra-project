@java.lang.Override
public void setValue(java.lang.Boolean value, boolean fire) {
    if (isAttached())
        ((com.google.gwt.dom.client.InputElement) (getInputElement().cast())).setChecked((value == null ? false : value));
    
    super.setValue(value, fire);
}