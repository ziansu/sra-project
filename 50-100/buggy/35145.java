public void setStiction(double f_stiction) {
    if ((tauDamping) == null) {
        tauDamping = new us.ihmc.robotics.dataStructures.variable.DoubleYoVariable(("tau_damp_" + (this.name)), "PinJoint damping torque", registry);
    }
    if ((this.f_stiction) == null) {
        this.f_stiction = new us.ihmc.robotics.dataStructures.variable.DoubleYoVariable(("f_stiction_" + (this.name)), "PinJoint stiction force", registry);
        this.f_stiction.set(f_stiction);
    }
}