@java.lang.Override
public java.lang.Object createViewCamera(org.eclipse.ice.client.widgets.jme.EmbeddedView view) {
    java.lang.Object cam = super.createViewCamera(view);
    if (cam != null) {
        org.eclipse.ice.client.widgets.jme.FlightCamera flyCam = ((org.eclipse.ice.client.widgets.jme.FlightCamera) (cam));
        flyCam.setPosition(defaultPosition);
        flyCam.setOrientation(defaultDirection, defaultUp);
        flyCam.setEnabled(true);
    }
    return cam;
}