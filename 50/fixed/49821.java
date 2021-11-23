@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent event) {
    if ((gov.ornl.eden.GUIContext.getInstance().getProperties()) != null) {
        gov.ornl.eden.GUIContext.getInstance().getProperties().save();
    }
}