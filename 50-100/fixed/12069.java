private void extract(com.griaule.grfingerjava.FingerprintImage fingerprintImage) {
    try {
        template = matchingContext.extract(fingerprintImage);
        if ((fingerprintingComponent) != null) {
            fingerprintingComponent.showImage(fingerprintImage);
            fingerprintingComponent.showQuality(template.getQuality());
        }
    } catch (com.griaule.grfingerjava.GrFingerJavaException e) {
        showMessage(e.getMessage());
    }
}