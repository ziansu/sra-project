@java.lang.Override
void setZoom(@com.flurgle.camerakit.Zoom
int zoom) {
    synchronized(this) {
        this.mZoom = zoom;
    }
}