@java.lang.Override
protected org.apache.wicket.Component resolveComponent(java.lang.String id, org.orienteer.core.component.property.DisplayMode mode, com.orientechnologies.orient.core.metadata.schema.OProperty property) {
    return (DisplayMode.VIEW.equals(mode)) || (property == null) ? new org.orienteer.core.component.property.LinkViewPanel(id, getEntityModel(), getValueModel()) : super.resolveComponent(id, mode, property);
}