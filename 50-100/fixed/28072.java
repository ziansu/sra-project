@java.lang.Override
public void stateChanged(org.eclipse.scout.rt.platform.PlatformEvent event) throws org.eclipse.scout.rt.platform.PlatformException {
    if ((event.getState()) == (IPlatform.State.BeanContextPrepared)) {
        org.eclipse.scout.rt.platform.IBeanContext context = event.getSource().getBeanContext();
        org.eclipse.scout.rt.platform.pluginxml.internal.PluginXmlParser.get().visit(new org.eclipse.scout.rt.ui.swing.extension.FormFieldsPluginXmlVisitor(context));
    }
}