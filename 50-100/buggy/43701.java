@java.lang.Override
public void recalculateRenderScale(double newZoom) {
    if ((!(currentTrack)) && ((zoom) != newZoom)) {
        if ((culler) != null) {
            culler.cancel(true);
        }
        double cullDistance = java.lang.Math.pow(2.0, ((base) - (zoom)));
        culler = new net.osmand.plus.views.AsynchronousResampler.RamerDouglasPeucer(this, cullDistance);
        if ((zoom) < newZoom) {
            culled = null;
        }
        zoom = newZoom;
        culler.execute("");
    }
}