@java.lang.Override
public org.eclipse.ui.views.properties.IPropertyDescriptor[] getPropertyDescriptors() {
    org.eclipse.ui.views.properties.IPropertyDescriptor[] ipd = new org.eclipse.ui.views.properties.IPropertyDescriptor[relatedElements.size()];
    for (int i = 0; i < (ipd.length); i++) {
        ipd[i] = new org.eclipse.ui.views.properties.PropertyDescriptor(i, (("[" + i) + "]"));
    }
    return ipd;
}