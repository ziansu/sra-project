private double[] calculateAnglePosAndDerOfJoint(us.ihmc.simulationconstructionset.PinJoint joint) {
    double[] finale = new double[2];
    double angle = joint.getQ().getDoubleValue();
    double angleVel = joint.getQD().getDoubleValue();
    angle = ((angle * 180) / (java.lang.Math.PI)) % 360;
    finale[0] = (angle * (java.lang.Math.PI)) / 180;
    finale[1] = java.lang.Math.abs(angleVel);
    return finale;
}