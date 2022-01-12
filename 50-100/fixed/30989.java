@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    org.liquidengine.legui.component.SelectBox.SelectBoxElement that = ((org.liquidengine.legui.component.SelectBox.SelectBoxElement) (o));
    return new org.apache.commons.lang3.builder.EqualsBuilder().appendSuper(super.equals(o)).append(selected, that.selected).append(text, that.text).isEquals();
}