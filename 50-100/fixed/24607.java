public void disable() {
    splashGeometry.setTranslation(geometry.getTranslation());
    startTime = 0;
    geometry.setTranslation(new com.metaio.sdk.jni.Vector3d(0.0F, 0.0F, 0.0F));
    splashGeometry.setVisible(true);
    geometry.setVisible(false);
    paintballShadow.setVisible(false);
    isActive = false;
    startPosition = new com.metaio.sdk.jni.Vector3d(0.0F, 0.0F, 0.0F);
    startVelocity = new com.metaio.sdk.jni.Vector3d(0.0F, 0.0F, 0.0F);
}