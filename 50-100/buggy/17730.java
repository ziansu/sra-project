private static void attachChaseCamera(com.jme3.scene.Node playerNode, com.jme3.renderer.Camera cam) {
    com.jme3.input.ChaseCamera chaseCam = new com.jme3.input.ChaseCamera(cam);
    chaseCam.setRotationSensitivity(0);
    chaseCam.setDefaultHorizontalRotation(new java.lang.Float(((com.jme3.math.FastMath.PI) / 2)));
    chaseCam.setDefaultVerticalRotation(new java.lang.Float(((com.jme3.math.FastMath.PI) / 9)));
    playerNode.addControl(chaseCam);
}