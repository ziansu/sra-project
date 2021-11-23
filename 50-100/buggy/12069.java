private void extract(com.griaule.grfingerjava.FingerprintImage fingerprintImage) {
    try {
        template = matchingContext.extract(fingerprintImage);
        if ((fingerprintingComponent) != null) {
            fingerprintingComponent.showQuality(template.getQuality());
            fingerprintingComponent.showImage(fingerprintImage);
        }
    } catch (com.griaule.grfingerjava.GrFingerJavaException e) {
        showMessage(e.getMessage());
    }
}