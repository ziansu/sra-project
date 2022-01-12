protected void validateComponentTree(final org.hdiv.validation.ValidationContext context, final javax.faces.component.UIComponent component) {
    validateComponent(context, component);
    java.util.Iterator<javax.faces.component.UIComponent> it = component.getFacetsAndChildren();
    while (it.hasNext()) {
        javax.faces.component.UIComponent child = it.next();
        validateComponentTree(context, child);
    } 
}