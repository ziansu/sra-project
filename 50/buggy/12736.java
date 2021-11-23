public void setMAX_ENCODER_VEL(double mAX_ENCODER_VEL) {
    MAX_ENCODER_VEL_RIGHT = mAX_ENCODER_VEL;
    MAX_ENCODER_VEL_LEFT = mAX_ENCODER_VEL;
    encoderChanges = new java.util.LinkedList<org.team3309.lib.controllers.drive.VelocityChangePoint>();
    encoderChanges.add(new org.team3309.lib.controllers.drive.VelocityChangePoint(MAX_ENCODER_VEL_RIGHT, 0));
}