private void setXYDisplacements() {
    switch (angleStr) {
        case org.esa.s1tbx.fex.gpf.texture.GLCMOp.ANGLE_0 :
            displacementX = displacement;
            displacementY = 0;
            break;
        case org.esa.s1tbx.fex.gpf.texture.GLCMOp.ANGLE_45 :
            displacementX = displacement;
            displacementY = displacement;
            break;
        case org.esa.s1tbx.fex.gpf.texture.GLCMOp.ANGLE_90 :
            displacementX = 0;
            displacementY = displacement;
            break;
        case org.esa.s1tbx.fex.gpf.texture.GLCMOp.ANGLE_135 :
            displacementX = -(displacement);
            displacementY = displacement;
            break;
        case org.esa.s1tbx.fex.gpf.texture.GLCMOp.ANGLE_ALL :
            computeGLCPWithAllAngles = true;
            break;
        default :
            throw new org.esa.snap.core.gpf.OperatorException(("Unknown angle: " + (angleStr)));
    }
}