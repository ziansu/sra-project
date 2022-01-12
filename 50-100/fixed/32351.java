@java.lang.Override
public boolean applicable(final org.eclipse.sapphire.services.ServiceContext context) {
    boolean retval = false;
    final org.eclipse.sapphire.ValueProperty prop = context.find(org.eclipse.sapphire.ValueProperty.class);
    org.eclipse.sapphire.ValueProperty property = com.liferay.ide.project.core.modules.BaseModuleOp.PROP_PROJECT_PROVIDER;
    if ((prop != null) && (prop.name().equals(property.name()))) {
        retval = true;
    }
    return retval;
}