@java.lang.Override
public void drawOn(org.minueto.image.MinuetoDrawingSurface canvas) {
    if (!(packed)) {
        pack();
    }else {
        for (mw.client.gui.api.WindowComponent comp : mw.util.MultiArrayIterable.toIterable(components)) {
            if (comp != null) {
                comp.drawOn(canvas);
            }
        }
    }
}