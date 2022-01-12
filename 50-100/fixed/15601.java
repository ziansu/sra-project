public void disable() {
    splashGeometry.setTranslation(geometry.getTranslation());
    startTime = 0;
    splashGeometry.setVisible(true);
    geometry.setVisible(false);
    paintballShadow.setVisible(false);
    isActive = false;
    startVelocity = new com.metaio.sdk.jni.Vector3d(0.0F, 0.0F, 0.0F);
    geometry.setTranslation(startPosition);
}