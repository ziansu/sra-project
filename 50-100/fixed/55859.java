@java.lang.Override
public void stop(final org.osgi.framework.BundleContext context) throws java.lang.Exception {
    org.palladiosimulator.editors.resourceenvironment.design.Activator.plugin = null;
    if ((org.palladiosimulator.editors.resourceenvironment.design.Activator.viewpoints) != null) {
        for (final org.eclipse.sirius.viewpoint.description.Viewpoint viewpoint : org.palladiosimulator.editors.resourceenvironment.design.Activator.viewpoints) {
            org.eclipse.sirius.business.api.componentization.ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
        }
        org.palladiosimulator.editors.resourceenvironment.design.Activator.viewpoints.clear();
        org.palladiosimulator.editors.resourceenvironment.design.Activator.viewpoints = null;
    }
    super.stop(context);
}