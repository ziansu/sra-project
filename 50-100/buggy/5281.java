@java.lang.Override
public org.openflexo.swing.LookAndFeel getLookAndFeel() {
    org.openflexo.foundation.FlexoProperty p = assertProperty(((org.openflexo.toolbox.ToolBox.getPLATFORM()) + (org.openflexo.prefs.PresentationPreferences.LOOK_AND_FEEL)));
    java.lang.String returned = p.getValue();
    if (returned == null) {
        p = assertProperty(org.openflexo.prefs.PresentationPreferences.LOOK_AND_FEEL);
        returned = p.getValue();
    }
    if (returned == null) {
        returned = javax.swing.UIManager.getSystemLookAndFeelClassName();
    }
    return LAF_CONVERTER.convertFromString(returned, null);
}