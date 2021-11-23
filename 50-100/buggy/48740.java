@java.lang.Override
public void onGammaCurve(double gamma) {
    if (gamma != 0) {
        if ((gamma > 0.9) & (gamma < 1.1)) {
            gamma_ = 1;
        }else {
            gamma_ = gamma;
        }
        applyLUT(true);
        postNewSettings();
    }
}