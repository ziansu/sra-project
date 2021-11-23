@java.lang.Override
public java.lang.Object createViewCamera(org.eclipse.ice.client.widgets.jme.EmbeddedView view) {
    java.lang.Object cam = null;
    if ((view != null) && (view == (embeddedView))) {
        org.eclipse.ice.client.widgets.jme.FlightCamera flyCam = new org.eclipse.ice.client.widgets.jme.FlightCamera(view.getCamera());
        flyCam.setInputManager(app.getInputManager());
        flyCam.setEnabled(true);
        cam = flyCam;
    }
    return cam;
}