public void setDFTSize(spectrum.DFTSize size) {
    mDFTProcessor.setDFTSize(size);
    mOverlayPanel.setDFTSize(size);
    mDFTSize = size;
    properties.SystemProperties properties = properties.SystemProperties.getInstance();
    properties.set(spectrum.SpectralDisplayPanel.FFT_SIZE_PROPERTY, size.name());
    setZoom(0, 0, 0);
}