@java.lang.Override
protected org.apache.wicket.Component resolveComponent(java.lang.String id, org.orienteer.core.component.property.DisplayMode mode, com.orientechnologies.orient.core.metadata.schema.OProperty property) {
    if (property == null) {
        return new org.orienteer.core.component.property.LinkViewPanel(id, getEntityModel(), getValueModel());
    }
    return DisplayMode.VIEW.equals(mode) ? new org.orienteer.core.component.property.LinkViewPanel(id, getEntityModel(), getValueModel()) : super.resolveComponent(id, mode, property);
}