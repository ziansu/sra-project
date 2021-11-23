public boolean changeSaturation(double newSaturation) {
    if ((java.lang.Math.abs(((this.contrast) - newSaturation))) >= (this.SLIDER_CHANGE_THRESH)) {
        this.saturation = newSaturation;
        this.updateBrightnessContrastSaturationGaussian();
        fotofinish.FotoFinishModel.logger.log(java.util.logging.Level.INFO, "saturation changed to {0}", this.saturation);
        return true;
    }
    return false;
}