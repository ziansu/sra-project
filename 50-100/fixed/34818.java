private double[] calculateAnglePosAndDerOfJoint(us.ihmc.simulationconstructionset.PinJoint joint) {
    double[] finale = new double[2];
    double angle = joint.getQ().getDoubleValue();
    double angleVel = joint.getQD().getDoubleValue();
    finale[0] = angle;
    finale[1] = angleVel;
    return finale;
}