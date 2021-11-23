@java.lang.Override
public void onCreate() {
    super.onCreate();
    dataLayer = new tsc.uea.ac.uk.shared.DataLayer(this);
    tsc.uea.ac.uk.hardwareaccess.DataListener.accelorometer = new float[3];
}