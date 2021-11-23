@com.simsilica.lemur.style.StyleAttribute(value = "insets", lookupDefault = false)
public void setInsets(com.simsilica.lemur.Insets3f i) {
    com.simsilica.lemur.component.InsetsComponent ic = getInsetsComponent();
    if (i != null) {
        if (ic == null) {
            ic = new com.simsilica.lemur.component.InsetsComponent(i);
        }
    }else {
        ic = null;
    }
    setInsetsComponent(ic);
}