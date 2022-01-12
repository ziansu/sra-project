private boolean shouldIgnoreParameter(java.lang.String name) {
    return (((this) instanceof org.fusesource.ide.camel.model.service.core.model.CamelRouteContainerElement) && ((getUnderlyingMetaModelObject()) != null)) && (getUnderlyingMetaModelObject().getParameter(name).getKind().equalsIgnoreCase(org.fusesource.ide.camel.model.service.core.model.AbstractCamelModelElement.NODE_KIND_ELEMENT));
}